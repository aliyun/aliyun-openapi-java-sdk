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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListDSTSpansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDSTSpansResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<SpansItem> spans;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<SpansItem> getSpans() {
		return this.spans;
	}

	public void setSpans(List<SpansItem> spans) {
		this.spans = spans;
	}

	public static class SpansItem {

		private String basicInfo;

		private String component;

		private Long duration;

		private String envInstanceId;

		private String kind;

		private String localInfo;

		private String localIpv4;

		private String localServiceName;

		private String name;

		private String parentId;

		private String remoteInfo;

		private String remoteIpv4;

		private String remoteServiceName;

		private String result;

		private String spanId;

		private Long startTime;

		private String traceId;

		private List<TagsItem> tags;

		public String getBasicInfo() {
			return this.basicInfo;
		}

		public void setBasicInfo(String basicInfo) {
			this.basicInfo = basicInfo;
		}

		public String getComponent() {
			return this.component;
		}

		public void setComponent(String component) {
			this.component = component;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public String getEnvInstanceId() {
			return this.envInstanceId;
		}

		public void setEnvInstanceId(String envInstanceId) {
			this.envInstanceId = envInstanceId;
		}

		public String getKind() {
			return this.kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getLocalInfo() {
			return this.localInfo;
		}

		public void setLocalInfo(String localInfo) {
			this.localInfo = localInfo;
		}

		public String getLocalIpv4() {
			return this.localIpv4;
		}

		public void setLocalIpv4(String localIpv4) {
			this.localIpv4 = localIpv4;
		}

		public String getLocalServiceName() {
			return this.localServiceName;
		}

		public void setLocalServiceName(String localServiceName) {
			this.localServiceName = localServiceName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getRemoteInfo() {
			return this.remoteInfo;
		}

		public void setRemoteInfo(String remoteInfo) {
			this.remoteInfo = remoteInfo;
		}

		public String getRemoteIpv4() {
			return this.remoteIpv4;
		}

		public void setRemoteIpv4(String remoteIpv4) {
			this.remoteIpv4 = remoteIpv4;
		}

		public String getRemoteServiceName() {
			return this.remoteServiceName;
		}

		public void setRemoteServiceName(String remoteServiceName) {
			this.remoteServiceName = remoteServiceName;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getSpanId() {
			return this.spanId;
		}

		public void setSpanId(String spanId) {
			this.spanId = spanId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class TagsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListDSTSpansResponse getInstance(UnmarshallerContext context) {
		return	ListDSTSpansResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
