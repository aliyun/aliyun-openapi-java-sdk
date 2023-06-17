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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSecurityEventMarkMissListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityEventMarkMissListResponse extends AcsResponse {

	private String requestId;

	private List<SecurityEventMarkMissReponse> list;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SecurityEventMarkMissReponse> getList() {
		return this.list;
	}

	public void setList(List<SecurityEventMarkMissReponse> list) {
		this.list = list;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class SecurityEventMarkMissReponse {

		private String eventName;

		private String internetIp;

		private String eventNameOriginal;

		private Long aliUid;

		private String fieldValue;

		private String instanceId;

		private String field;

		private String intranetIp;

		private String filedAliasName;

		private String uuid;

		private String operate;

		private String eventTypeOriginal;

		private String eventType;

		private String instanceName;

		private Long id;

		public String getEventName() {
			return this.eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getEventNameOriginal() {
			return this.eventNameOriginal;
		}

		public void setEventNameOriginal(String eventNameOriginal) {
			this.eventNameOriginal = eventNameOriginal;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getFieldValue() {
			return this.fieldValue;
		}

		public void setFieldValue(String fieldValue) {
			this.fieldValue = fieldValue;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getField() {
			return this.field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getFiledAliasName() {
			return this.filedAliasName;
		}

		public void setFiledAliasName(String filedAliasName) {
			this.filedAliasName = filedAliasName;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getOperate() {
			return this.operate;
		}

		public void setOperate(String operate) {
			this.operate = operate;
		}

		public String getEventTypeOriginal() {
			return this.eventTypeOriginal;
		}

		public void setEventTypeOriginal(String eventTypeOriginal) {
			this.eventTypeOriginal = eventTypeOriginal;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeSecurityEventMarkMissListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityEventMarkMissListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
