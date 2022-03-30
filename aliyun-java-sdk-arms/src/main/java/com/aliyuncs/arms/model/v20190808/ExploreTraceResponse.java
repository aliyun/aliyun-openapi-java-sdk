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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ExploreTraceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExploreTraceResponse extends AcsResponse {

	private String requestId;

	private List<SpanVO> spanVOs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SpanVO> getSpanVOs() {
		return this.spanVOs;
	}

	public void setSpanVOs(List<SpanVO> spanVOs) {
		this.spanVOs = spanVOs;
	}

	public static class SpanVO {

		private String traceId;

		private String spanId;

		private String parentSpanId;

		private Long startTime;

		private Long duration;

		private String kind;

		private String pid;

		private String serviceName;

		private String spanName;

		private String ip;

		private String hostname;

		private String sampleIds;

		private Integer statusCode;

		private String statusMessage;

		private Map<Object,Object> attributes;

		private Map<Object,Object> resource;

		private String events;

		private String links;

		private Map<Object,Object> hiddenAttributes;

		private Map<Object,Object> meta;

		private List<String> children;

		private List<String> labels;

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}

		public String getSpanId() {
			return this.spanId;
		}

		public void setSpanId(String spanId) {
			this.spanId = spanId;
		}

		public String getParentSpanId() {
			return this.parentSpanId;
		}

		public void setParentSpanId(String parentSpanId) {
			this.parentSpanId = parentSpanId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public String getKind() {
			return this.kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getSpanName() {
			return this.spanName;
		}

		public void setSpanName(String spanName) {
			this.spanName = spanName;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getSampleIds() {
			return this.sampleIds;
		}

		public void setSampleIds(String sampleIds) {
			this.sampleIds = sampleIds;
		}

		public Integer getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(Integer statusCode) {
			this.statusCode = statusCode;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}

		public Map<Object,Object> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(Map<Object,Object> attributes) {
			this.attributes = attributes;
		}

		public Map<Object,Object> getResource() {
			return this.resource;
		}

		public void setResource(Map<Object,Object> resource) {
			this.resource = resource;
		}

		public String getEvents() {
			return this.events;
		}

		public void setEvents(String events) {
			this.events = events;
		}

		public String getLinks() {
			return this.links;
		}

		public void setLinks(String links) {
			this.links = links;
		}

		public Map<Object,Object> getHiddenAttributes() {
			return this.hiddenAttributes;
		}

		public void setHiddenAttributes(Map<Object,Object> hiddenAttributes) {
			this.hiddenAttributes = hiddenAttributes;
		}

		public Map<Object,Object> getMeta() {
			return this.meta;
		}

		public void setMeta(Map<Object,Object> meta) {
			this.meta = meta;
		}

		public List<String> getChildren() {
			return this.children;
		}

		public void setChildren(List<String> children) {
			this.children = children;
		}

		public List<String> getLabels() {
			return this.labels;
		}

		public void setLabels(List<String> labels) {
			this.labels = labels;
		}
	}

	@Override
	public ExploreTraceResponse getInstance(UnmarshallerContext context) {
		return	ExploreTraceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
