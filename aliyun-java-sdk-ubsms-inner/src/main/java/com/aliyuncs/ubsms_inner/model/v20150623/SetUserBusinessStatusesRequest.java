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
package com.aliyuncs.ubsms_inner.model.v20150623;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetUserBusinessStatusesRequest extends RpcAcsRequest<SetUserBusinessStatusesResponse> {
	
	public SetUserBusinessStatusesRequest() {
		super("Ubsms-inner", "2015-06-23", "SetUserBusinessStatuses");
	}

	private String uid;

	private String serviceCode;

	private String statusKey1;

	private String statusValue1;

	private String statusKey2;

	private String statusValue2;

	private String statusKey3;

	private String statusValue3;

	private String statusKey4;

	private String statusValue4;

	private String statusKey5;

	private String statusValue5;

	private String statusKey6;

	private String statusValue6;

	private String statusKey7;

	private String statusValue7;

	private String statusKey8;

	private String statusValue8;

	private String statusKey9;

	private String statusValue9;

	private String statusKey10;

	private String statusValue10;

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		putQueryParameter("Uid", uid);
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode= serviceCode;
		putQueryParameter("ServiceCode", serviceCode);
	}

	public String getStatusKey1() {
		return this.statusKey1;
	}

	public void setStatusKey1(String statusKey1) {
		this.statusKey1 = statusKey1;
		putQueryParameter("StatusKey1", statusKey1);
	}

	public String getStatusValue1() {
		return this.statusValue1;
	}

	public void setStatusValue1(String statusValue1) {
		this.statusValue1 = statusValue1;
		putQueryParameter("StatusValue1", statusValue1);
	}

	public String getStatusKey2() {
		return this.statusKey2;
	}

	public void setStatusKey2(String statusKey2) {
		this.statusKey2 = statusKey2;
		putQueryParameter("StatusKey2", statusKey2);
	}

	public String getStatusValue2() {
		return this.statusValue2;
	}

	public void setStatusValue2(String statusValue2) {
		this.statusValue2 = statusValue2;
		putQueryParameter("StatusValue2", statusValue2);
	}

	public String getStatusKey3() {
		return this.statusKey3;
	}

	public void setStatusKey3(String statusKey3) {
		this.statusKey3 = statusKey3;
		putQueryParameter("StatusKey3", statusKey3);
	}

	public String getStatusValue3() {
		return this.statusValue3;
	}

	public void setStatusValue3(String statusValue3) {
		this.statusValue3 = statusValue3;
		putQueryParameter("StatusValue3", statusValue3);
	}

	public String getStatusKey4() {
		return this.statusKey4;
	}

	public void setStatusKey4(String statusKey4) {
		this.statusKey4 = statusKey4;
		putQueryParameter("StatusKey4", statusKey4);
	}

	public String getStatusValue4() {
		return this.statusValue4;
	}

	public void setStatusValue4(String statusValue4) {
		this.statusValue4 = statusValue4;
		putQueryParameter("StatusValue4", statusValue4);
	}

	public String getStatusKey5() {
		return this.statusKey5;
	}

	public void setStatusKey5(String statusKey5) {
		this.statusKey5 = statusKey5;
		putQueryParameter("StatusKey5", statusKey5);
	}

	public String getStatusValue5() {
		return this.statusValue5;
	}

	public void setStatusValue5(String statusValue5) {
		this.statusValue5 = statusValue5;
		putQueryParameter("StatusValue5", statusValue5);
	}

	public String getStatusKey6() {
		return this.statusKey6;
	}

	public void setStatusKey6(String statusKey6) {
		this.statusKey6 = statusKey6;
		putQueryParameter("StatusKey6", statusKey6);
	}

	public String getStatusValue6() {
		return this.statusValue6;
	}

	public void setStatusValue6(String statusValue6) {
		this.statusValue6 = statusValue6;
		putQueryParameter("StatusValue6", statusValue6);
	}

	public String getStatusKey7() {
		return this.statusKey7;
	}

	public void setStatusKey7(String statusKey7) {
		this.statusKey7 = statusKey7;
		putQueryParameter("StatusKey7", statusKey7);
	}

	public String getStatusValue7() {
		return this.statusValue7;
	}

	public void setStatusValue7(String statusValue7) {
		this.statusValue7 = statusValue7;
		putQueryParameter("StatusValue7", statusValue7);
	}

	public String getStatusKey8() {
		return this.statusKey8;
	}

	public void setStatusKey8(String statusKey8) {
		this.statusKey8 = statusKey8;
		putQueryParameter("StatusKey8", statusKey8);
	}

	public String getStatusValue8() {
		return this.statusValue8;
	}

	public void setStatusValue8(String statusValue8) {
		this.statusValue8 = statusValue8;
		putQueryParameter("StatusValue8", statusValue8);
	}

	public String getStatusKey9() {
		return this.statusKey9;
	}

	public void setStatusKey9(String statusKey9) {
		this.statusKey9 = statusKey9;
		putQueryParameter("StatusKey9", statusKey9);
	}

	public String getStatusValue9() {
		return this.statusValue9;
	}

	public void setStatusValue9(String statusValue9) {
		this.statusValue9 = statusValue9;
		putQueryParameter("StatusValue9", statusValue9);
	}

	public String getStatusKey10() {
		return this.statusKey10;
	}

	public void setStatusKey10(String statusKey10) {
		this.statusKey10 = statusKey10;
		putQueryParameter("StatusKey10", statusKey10);
	}

	public String getStatusValue10() {
		return this.statusValue10;
	}

	public void setStatusValue10(String statusValue10) {
		this.statusValue10 = statusValue10;
		putQueryParameter("StatusValue10", statusValue10);
	}

	@Override
	public Class<SetUserBusinessStatusesResponse> getResponseClass() {
		return SetUserBusinessStatusesResponse.class;
	}

}
