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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeOpEntitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOpEntitiesResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<OpEntity> opEntities;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<OpEntity> getOpEntities() {
		return this.opEntities;
	}

	public void setOpEntities(List<OpEntity> opEntities) {
		this.opEntities = opEntities;
	}

	public static class OpEntity {

		private Long gmtCreate;

		private Integer entityType;

		private String entityObject;

		private Integer opAction;

		private String opAccount;

		private String opDesc;

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getEntityType() {
			return this.entityType;
		}

		public void setEntityType(Integer entityType) {
			this.entityType = entityType;
		}

		public String getEntityObject() {
			return this.entityObject;
		}

		public void setEntityObject(String entityObject) {
			this.entityObject = entityObject;
		}

		public Integer getOpAction() {
			return this.opAction;
		}

		public void setOpAction(Integer opAction) {
			this.opAction = opAction;
		}

		public String getOpAccount() {
			return this.opAccount;
		}

		public void setOpAccount(String opAccount) {
			this.opAccount = opAccount;
		}

		public String getOpDesc() {
			return this.opDesc;
		}

		public void setOpDesc(String opDesc) {
			this.opDesc = opDesc;
		}
	}

	@Override
	public DescribeOpEntitiesResponse getInstance(UnmarshallerContext context) {
		return	DescribeOpEntitiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
