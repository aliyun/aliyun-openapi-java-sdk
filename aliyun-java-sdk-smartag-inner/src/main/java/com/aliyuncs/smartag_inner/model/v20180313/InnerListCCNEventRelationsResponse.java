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

package com.aliyuncs.smartag_inner.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag_inner.transform.v20180313.InnerListCCNEventRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerListCCNEventRelationsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<EventRelation> eventRelations;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<EventRelation> getEventRelations() {
		return this.eventRelations;
	}

	public void setEventRelations(List<EventRelation> eventRelations) {
		this.eventRelations = eventRelations;
	}

	public static class EventRelation {

		private Long id;

		private String parentEventRegionNo;

		private String parentEventInstanceId;

		private String parentEventNamespace;

		private String childEventRegionNo;

		private String childEventInstanceId;

		private String childEventNamespace;

		private String gmtCreate;

		private String gmtModify;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getParentEventRegionNo() {
			return this.parentEventRegionNo;
		}

		public void setParentEventRegionNo(String parentEventRegionNo) {
			this.parentEventRegionNo = parentEventRegionNo;
		}

		public String getParentEventInstanceId() {
			return this.parentEventInstanceId;
		}

		public void setParentEventInstanceId(String parentEventInstanceId) {
			this.parentEventInstanceId = parentEventInstanceId;
		}

		public String getParentEventNamespace() {
			return this.parentEventNamespace;
		}

		public void setParentEventNamespace(String parentEventNamespace) {
			this.parentEventNamespace = parentEventNamespace;
		}

		public String getChildEventRegionNo() {
			return this.childEventRegionNo;
		}

		public void setChildEventRegionNo(String childEventRegionNo) {
			this.childEventRegionNo = childEventRegionNo;
		}

		public String getChildEventInstanceId() {
			return this.childEventInstanceId;
		}

		public void setChildEventInstanceId(String childEventInstanceId) {
			this.childEventInstanceId = childEventInstanceId;
		}

		public String getChildEventNamespace() {
			return this.childEventNamespace;
		}

		public void setChildEventNamespace(String childEventNamespace) {
			this.childEventNamespace = childEventNamespace;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}
	}

	@Override
	public InnerListCCNEventRelationsResponse getInstance(UnmarshallerContext context) {
		return	InnerListCCNEventRelationsResponseUnmarshaller.unmarshall(this, context);
	}
}
