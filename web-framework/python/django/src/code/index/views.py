from django.http import JsonResponse
import json
import arrow

# Create your views here.
def index(request):
    body_str = request.body.decode('utf-8')
    response_content = {
        "msg": "Hello, World!" + " at " + arrow.now().format("YYYY-MM-DD HH:mm:ss"),
        "request": {
            "query": dict(request.GET),
            "path": "",
            "data": body_str,
            "clientIp": request.META.get('REMOTE_ADDR'),
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
            "clientIp": request.META.get('REMOTE_ADDR'),
        },
    }
    return JsonResponse(response_content)