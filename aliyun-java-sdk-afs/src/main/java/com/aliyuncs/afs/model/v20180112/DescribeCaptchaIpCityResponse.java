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
package com.aliyuncs.afs.model.v20180112;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.afs.transform.v20180112.DescribeCaptchaIpCityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCaptchaIpCityResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private Boolean hasData;

	private List<CaptchaCitie> captchaCities;

	private List<CaptchaIp> captchaIps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public Boolean getHasData() {
		return this.hasData;
	}

	public void setHasData(Boolean hasData) {
		this.hasData = hasData;
	}

	public List<CaptchaCitie> getCaptchaCities() {
		return this.captchaCities;
	}

	public void setCaptchaCities(List<CaptchaCitie> captchaCities) {
		this.captchaCities = captchaCities;
	}

	public List<CaptchaIp> getCaptchaIps() {
		return this.captchaIps;
	}

	public void setCaptchaIps(List<CaptchaIp> captchaIps) {
		this.captchaIps = captchaIps;
	}

	public static class CaptchaCitie {

		private String location;

		private String lat;

		private String lng;

		private Integer pv;

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getLat() {
			return this.lat;
		}

		public void setLat(String lat) {
			this.lat = lat;
		}

		public String getLng() {
			return this.lng;
		}

		public void setLng(String lng) {
			this.lng = lng;
		}

		public Integer getPv() {
			return this.pv;
		}

		public void setPv(Integer pv) {
			this.pv = pv;
		}
	}

	public static class CaptchaIp {

		private String ip;

		private Integer value;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Integer getValue() {
			return this.value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}
	}

	@Override
	public DescribeCaptchaIpCityResponse getInstance(UnmarshallerContext context) {
		return	DescribeCaptchaIpCityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
