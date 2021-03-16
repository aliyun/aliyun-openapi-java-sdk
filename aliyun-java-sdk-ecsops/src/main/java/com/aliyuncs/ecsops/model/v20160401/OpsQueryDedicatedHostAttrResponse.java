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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryDedicatedHostAttrResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryDedicatedHostAttrResponse extends AcsResponse {

	private String requestId;

	private List<DedicatedHostAttr> dedicatedHostAttrs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DedicatedHostAttr> getDedicatedHostAttrs() {
		return this.dedicatedHostAttrs;
	}

	public void setDedicatedHostAttrs(List<DedicatedHostAttr> dedicatedHostAttrs) {
		this.dedicatedHostAttrs = dedicatedHostAttrs;
	}

	public static class DedicatedHostAttr {

		private String dedicatedHostId;

		private String attrName;

		private String attrVale;

		private String isDeleted;

		public String getDedicatedHostId() {
			return this.dedicatedHostId;
		}

		public void setDedicatedHostId(String dedicatedHostId) {
			this.dedicatedHostId = dedicatedHostId;
		}

		public String getAttrName() {
			return this.attrName;
		}

		public void setAttrName(String attrName) {
			this.attrName = attrName;
		}

		public String getAttrVale() {
			return this.attrVale;
		}

		public void setAttrVale(String attrVale) {
			this.attrVale = attrVale;
		}

		public String getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(String isDeleted) {
			this.isDeleted = isDeleted;
		}
	}

	@Override
	public OpsQueryDedicatedHostAttrResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryDedicatedHostAttrResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
