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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.ListClassesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClassesResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private List<ClassList> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<ClassList> getItems() {
		return this.items;
	}

	public void setItems(List<ClassList> items) {
		this.items = items;
	}

	public static class ClassList {

		private String maxIOPS;

		private String cpu;

		private String referencePrice;

		private String maxConnections;

		private String memoryClass;

		private String classCode;

		private String classGroup;

		private String maxIOMBPS;

		public String getMaxIOPS() {
			return this.maxIOPS;
		}

		public void setMaxIOPS(String maxIOPS) {
			this.maxIOPS = maxIOPS;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getReferencePrice() {
			return this.referencePrice;
		}

		public void setReferencePrice(String referencePrice) {
			this.referencePrice = referencePrice;
		}

		public String getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(String maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getMemoryClass() {
			return this.memoryClass;
		}

		public void setMemoryClass(String memoryClass) {
			this.memoryClass = memoryClass;
		}

		public String getClassCode() {
			return this.classCode;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}

		public String getClassGroup() {
			return this.classGroup;
		}

		public void setClassGroup(String classGroup) {
			this.classGroup = classGroup;
		}

		public String getMaxIOMBPS() {
			return this.maxIOMBPS;
		}

		public void setMaxIOMBPS(String maxIOMBPS) {
			this.maxIOMBPS = maxIOMBPS;
		}
	}

	@Override
	public ListClassesResponse getInstance(UnmarshallerContext context) {
		return	ListClassesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
