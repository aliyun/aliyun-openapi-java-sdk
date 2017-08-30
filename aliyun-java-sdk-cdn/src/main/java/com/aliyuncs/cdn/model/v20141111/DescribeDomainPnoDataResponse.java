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
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainPnoDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainPnoDataResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private Integer pageSize;

	private Integer pageNumber;

	private String domainName;

	private List<PnoDataModel> pnoDataModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public List<PnoDataModel> getPnoDataModels() {
		return this.pnoDataModels;
	}

	public void setPnoDataModels(List<PnoDataModel> pnoDataModels) {
		this.pnoDataModels = pnoDataModels;
	}

	public static class PnoDataModel {

		private String pno;

		private List<Detail> details;

		public String getPno() {
			return this.pno;
		}

		public void setPno(String pno) {
			this.pno = pno;
		}

		public List<Detail> getDetails() {
			return this.details;
		}

		public void setDetails(List<Detail> details) {
			this.details = details;
		}

		public static class Detail {

			private String timeStamp;

			private Float bandWidth;

			public String getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(String timeStamp) {
				this.timeStamp = timeStamp;
			}

			public Float getBandWidth() {
				return this.bandWidth;
			}

			public void setBandWidth(Float bandWidth) {
				this.bandWidth = bandWidth;
			}
		}
	}

	@Override
	public DescribeDomainPnoDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainPnoDataResponseUnmarshaller.unmarshall(this, context);
	}
}
