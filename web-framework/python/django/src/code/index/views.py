from django.http import JsonResponse
import json
import arrow


def get_client_ip(request):
    # 检查 X-Forwarded-For 头部，它通常包含客户端 IP
    x_forwarded_for = request.META.get('HTTP_X_FORWARDED_FOR')
    if x_forwarded_for:
        # X-Forwarded-For 可能包含多个 IP 地址，第一个为客户端 IP
        client_ip = x_forwarded_for.split(',')[0].strip()
    else:
        # 如果没有 X-Forwarded-For，使用 REMOTE_ADDR
        client_ip = request.META.get('REMOTE_ADDR')
    return client_ip

# Create your views here.
def index(request):
    body_str = request.body.decode('utf-8')
    response_content = {
        "msg": "Hello, World!" + " at " + arrow.now().format("YYYY-MM-DD HH:mm:ss"),
        "request": {
            "query": dict(request.GET),
            "path": "",
            "data": body_str,
            "clientIp": get_client_ip(request),
        },
    }
    return JsonResponse(response_content)


def default(request, path):
    body_str = request.body.decode('utf-8')
    response_content = {
        "msg": "Hello, World!" + " at " + arrow.now().format("YYYY-MM-DD HH:mm:ss"),
        "request": {
            "query": dict(request.GET),
            "path": path,
            "data": body_str,
            "clientIp": get_client_ip(request),
        },
    }
    return JsonResponse(response_content)