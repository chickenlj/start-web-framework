package main

import (
	"github.com/gin-gonic/gin"
)

func main() {
	r := gin.Default()
	r.GET("/ping", func(c *gin.Context) {
		c.JSON(200, gin.H{
			"message": "pong",
		})
	})
	r.GET("/", func(c *gin.Context) {
		queryParams := c.Request.URL.Query()
		headers := c.Request.Header
		path := c.Request.URL.Path

		c.JSON(200, gin.H{
			"message": "hello world",
			"query":   queryParams,
			"headers": headers,
			"path":    path,
		})
	})
	// listen and serve on 0.0.0.0:8080 (for windows "localhost:8080")
	r.Run()
}
