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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainQoSRtResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainQoSRtResponse extends AcsResponse {

	private String domainName;

	private String startTime;

	private String endTime;

	private String ip;

	private List<Data> content;

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public List<Data> getContent() {
		return this.content;
	}

	public void setContent(List<Data> content) {
		this.content = content;
	}

	public static class Data {

		private String more5s;

		private String time;

		private String more3s;

		public String getMore5s() {
			return this.more5s;
		}

		public void setMore5s(String more5s) {
			this.more5s = more5s;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getMore3s() {
			return this.more3s;
		}

		public void setMore3s(String more3s) {
			this.more3s = more3s;
		}
	}

	@Override
	public DescribeDomainQoSRtResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainQoSRtResponseUnmarshaller.unmarshall(this, context);
	}
}
