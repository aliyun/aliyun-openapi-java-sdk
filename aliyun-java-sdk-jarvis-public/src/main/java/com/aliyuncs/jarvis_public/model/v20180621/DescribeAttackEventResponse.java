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

package com.aliyuncs.jarvis_public.model.v20180621;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.jarvis_public.transform.v20180621.DescribeAttackEventResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAttackEventResponse extends AcsResponse {

	private String requestId;

	private String module;

	private List<Event> eventList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<Event> getEventList() {
		return this.eventList;
	}

	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}

	public static class Event {

		private String vmIp;

		private String sourceIp;

		private String url;

		private String attackType;

		private String gmtCreate;

		private Integer gmtCreateStamp;

		private String gmtModified;

		public String getVmIp() {
			return this.vmIp;
		}

		public void setVmIp(String vmIp) {
			this.vmIp = vmIp;
		}

		public String getSourceIp() {
			return this.sourceIp;
		}

		public void setSourceIp(String sourceIp) {
			this.sourceIp = sourceIp;
		}

		public String getBizUrl() {
			return this.url;
		}

		public void setBizUrl(String url) {
			this.url = url;
		}

		/**
		 * @deprecated use getBizUrl instead of this.
		 */
		@Deprecated
		public String getUrl() {
			return this.url;
		}

		/**
		 * @deprecated use setBizUrl instead of this.
		 */
		@Deprecated
		public void setUrl(String url) {
			this.url = url;
		}

		public String getAttackType() {
			return this.attackType;
		}

		public void setAttackType(String attackType) {
			this.attackType = attackType;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getGmtCreateStamp() {
			return this.gmtCreateStamp;
		}

		public void setGmtCreateStamp(Integer gmtCreateStamp) {
			this.gmtCreateStamp = gmtCreateStamp;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public DescribeAttackEventResponse getInstance(UnmarshallerContext context) {
		return	DescribeAttackEventResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
