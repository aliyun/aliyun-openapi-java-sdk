/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeMixStreamListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMixStreamListResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private List<MixStreamInfo> mixStreamList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<MixStreamInfo> getMixStreamList() {
		return this.mixStreamList;
	}

	public void setMixStreamList(List<MixStreamInfo> mixStreamList) {
		this.mixStreamList = mixStreamList;
	}

	public static class MixStreamInfo {

		private String mixstreamId;

		private String domainName;

		private String appName;

		private String streamName;

		private String layoutId;

		private Integer inputStreamNumber;

		private String mixStreamTemplate;

		private String gmtCreate;

		private String gmtModified;

		public String getMixstreamId() {
			return this.mixstreamId;
		}

		public void setMixstreamId(String mixstreamId) {
			this.mixstreamId = mixstreamId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getLayoutId() {
			return this.layoutId;
		}

		public void setLayoutId(String layoutId) {
			this.layoutId = layoutId;
		}

		public Integer getInputStreamNumber() {
			return this.inputStreamNumber;
		}

		public void setInputStreamNumber(Integer inputStreamNumber) {
			this.inputStreamNumber = inputStreamNumber;
		}

		public String getMixStreamTemplate() {
			return this.mixStreamTemplate;
		}

		public void setMixStreamTemplate(String mixStreamTemplate) {
			this.mixStreamTemplate = mixStreamTemplate;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public DescribeMixStreamListResponse getInstance(UnmarshallerContext context) {
		return	DescribeMixStreamListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
