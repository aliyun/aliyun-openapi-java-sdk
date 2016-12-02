/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author fray.yangb
 * @version
 */
public class PutMetricDataRequest extends RpcAcsRequest<PutMetricDataResponse> {

	public PutMetricDataRequest() {
		super("Cms", "2016-09-22", "PutMetricData", "cms");
		setMethod(MethodType.POST);
	}

	/**
	 * @param body
	 * 数据格式如下：
	 * [{"MetricName":“vm.cpu","Timestamp":"13770009766","Value":0.50,"Dimensions":“{unit:'count'}"} ,{"MetricName":“vm.mem”,"Timestamp":"13770009766","Value":0.51}]
	 * @throws UnsupportedEncodingException
	 */
	public void putFullData(JSONArray body) throws UnsupportedEncodingException {
		this.setContent(body.toString().getBytes("UTF-8"),"UTF-8", FormatType.JSON);
	}

	public void putSimpleData(String metricName, String value) throws UnsupportedEncodingException {
		JSONArray body = new JSONArray();
		JSONObject row = new JSONObject();
		row.put("metricName", metricName);
		JSONObject metricValues = new JSONObject();
		metricValues.put("value", value);
		row.put("metricValues", metricValues);
		row.put("timestamp", System.currentTimeMillis());
		body.add(row);
		putFullData(body);
	}

	public void putLocalSimpleData(String metricName, String value) throws UnsupportedEncodingException, UnknownHostException {
		JSONArray body = new JSONArray();
		JSONObject row = new JSONObject();
		row.put("metricName", metricName);
		JSONObject metricValues = new JSONObject();
		metricValues.put("value", value);
		row.put("metricValues", metricValues);

		JSONObject dimensions = new JSONObject();
		dimensions.put("host", InetAddress.getLocalHost().getHostName());
		row.put("dimensions", dimensions);
		row.put("timestamp", System.currentTimeMillis());
		body.add(row);
		putFullData(body);
	}

	@Override
	public Class<PutMetricDataResponse> getResponseClass() {
		return PutMetricDataResponse.class;
	}

}
