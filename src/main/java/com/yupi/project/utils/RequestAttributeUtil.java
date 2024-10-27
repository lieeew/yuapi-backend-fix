package com.yupi.project.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RequestAttributeUtil {

    /**
     * 设置请求属性
     *
     * @param request HttpServletRequest 对象
     * @param name    属性名称
     * @param value   属性值
     */
    public static void setAttribute(HttpServletRequest request, String name, Object value) {
        request.setAttribute(name, value);
    }

    /**
     * 获取请求属性
     *
     * @param request HttpServletRequest 对象
     * @param name    属性名称
     * @param <T>     属性类型
     * @return 属性值，找不到则返回 null
     */
    @SuppressWarnings("unchecked")
    public static <T> T getAttribute(HttpServletRequest request, String name) {
        return (T) request.getAttribute(name);
    }

    /**
     * 删除请求属性
     *
     * @param request HttpServletRequest 对象
     * @param name    属性名称
     */
    public static void removeAttribute(HttpServletRequest request, String name) {
        request.removeAttribute(name);
    }

    /**
     * 设置会话属性
     *
     * @param request HttpServletRequest 对象
     * @param name    属性名称
     * @param value   属性值
     */
    public static void setSessionAttribute(HttpServletRequest request, String name, Object value) {
        HttpSession session = request.getSession();
        session.setAttribute(name, value);
    }

    /**
     * 获取会话属性
     *
     * @param request HttpServletRequest 对象
     * @param name    属性名称
     * @param <T>     属性类型
     * @return 属性值，找不到则返回 null
     */
    @SuppressWarnings("unchecked")
    public static <T> T getSessionAttribute(HttpServletRequest request, String name) {
        HttpSession session = request.getSession(false);
        return (session != null) ? (T) session.getAttribute(name) : null;
    }

    /**
     * 删除会话属性
     *
     * @param request HttpServletRequest 对象
     * @param name    属性名称
     */
    public static void removeSessionAttribute(HttpServletRequest request, String name) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute(name);
        }
    }

    /**
     * 设置响应属性
     *
     * @param response HttpServletResponse 对象
     * @param name     属性名称
     * @param value    属性值
     */
    public static void setResponseHeader(HttpServletResponse response, String name, String value) {
        response.setHeader(name, value);
    }

    /**
     * 获取响应属性
     *
     * @param response HttpServletResponse 对象
     * @param name     属性名称
     * @return 属性值，找不到则返回 null
     */
    public static String getResponseHeader(HttpServletResponse response, String name) {
        return response.getHeader(name);
    }
}
