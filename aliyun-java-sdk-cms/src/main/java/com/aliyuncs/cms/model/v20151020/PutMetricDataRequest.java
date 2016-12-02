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
package com.aliyuncs.cms.model.v20151020;

import com.alibaba.fastjson.JSON;
import com.aliyuncs.cms.BodyHttpRequest;
import com.aliyuncs.http.MethodType;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/**
 * @author fray.yangb
 * @version 
 */
public class PutMetricDataRequest extends BodyHttpRequest<PutMetricDataResponse> {
	
	public PutMetricDataRequest() {
		super("Cms", "2016-09-22", "PutMetricData", "cms");
		setMethod(MethodType.POST);
	}

	private List<PostRow> body;

	public List<PostRow> getBody() {
		return body;
	}

	public void setBody(List<PostRow> body) {
		this.body = body;
		this.putBodyParameter("Body", JSON.toJSONString(body));
	}

	public void putSimpleData(String metricName, Number value) {
		PostRow pr = new PostRow();
		pr.setMetricName(metricName);
		pr.putMetricValue("value", value);
		pr.setTimestamp(System.currentTimeMillis());
		setBody(Arrays.asList(pr));
	}

	public void putLocalSimpleData(String metricName, Number value) throws UnknownHostException {
		PostRow pr = new PostRow();
		pr.setMetricName(metricName);
		pr.putMetricValue("value", value);
		pr.setTimestamp(System.currentTimeMillis());
		pr.putDimension("host", InetAddress.getLocalHost().getHostName());
		setBody(Arrays.asList(pr));
	}

	@Override
	public Class<PutMetricDataResponse> getResponseClass() {
		return PutMetricDataResponse.class;
	}

}
