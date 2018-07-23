# 1. Architecture Decision Record

Date: 23/07/2018

## Issue

We are looking for AR SDK to develop an AR application. AR SDK helps recognize and track planar images (Image Targets) and simple 3D objects, such as boxes, in real-time. Also it provides other features like cross platform support. 

## Status

Accepted

## Context

We have compared many other SDKs which can be used as an alternative to vuforia. However, on the parameters of  cost, stability and performance, vuforia stands out. [Here](https://docs.google.com/spreadsheets/d/16i528rydOj7yhPXnkNPXuaxhGBCMGWCcGXZBbs89fCA/edit#gid=0) is a detailed comparative analysis of all the SDKs we have considered.  

## Decision

We are proposing vuforia to develop our AR application.

## Consequences

Development becomes very much easy with Vuforia because of the performance, stability and active community support. At the same time, there is some cost associated with it. The pricing details can be seen [here](https://developer.vuforia.com/vui/pricing).
