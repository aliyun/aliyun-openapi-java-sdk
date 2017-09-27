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
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceNetworkDetailRequest extends RpcAcsRequest<DescribeDBInstanceNetworkDetailResponse> {
	
	public DescribeDBInstanceNetworkDetailRequest() {
		super("Rds", "2014-08-15", "DescribeDBInstanceNetworkDetail", "rds");
	}

	private String endPoint;

	private String startPoint;

	private String endTime;

	private String dBInstanceId;

	private String startTime;

	public String getEndPoint() {
		return this.endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
		if(endPoint != null){
			putQueryParameter("EndPoint", endPoint);
		}
	}

	public String getStartPoint() {
		return this.startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
		if(startPoint != null){
			putQueryParameter("StartPoint", startPoint);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	@Override
	public Class<DescribeDBInstanceNetworkDetailResponse> getResponseClass() {
		return DescribeDBInstanceNetworkDetailResponse.class;
	}

}
