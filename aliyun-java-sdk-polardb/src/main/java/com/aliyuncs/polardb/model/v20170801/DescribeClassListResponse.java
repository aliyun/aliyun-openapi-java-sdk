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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeClassListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClassListResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private List<ItemsItem> items;

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

	public List<ItemsItem> getItems() {
		return this.items;
	}

	public void setItems(List<ItemsItem> items) {
		this.items = items;
	}

	public static class ItemsItem {

		private String psl4MaxIOPS;

		private String classTypeLevel;

		private String cpu;

		private String referencePrice;

		private String maxConnections;

		private String memoryClass;

		private String classCode;

		private String classGroup;

		private String psl5MaxIOPS;

		private String maxIOPS;

		private String maxStorageCapacity;

		private String pl1MaxIOPS;

		private String pl2MaxIOPS;

		private String pl3MaxIOPS;

		public String getPsl4MaxIOPS() {
			return this.psl4MaxIOPS;
		}

		public void setPsl4MaxIOPS(String psl4MaxIOPS) {
			this.psl4MaxIOPS = psl4MaxIOPS;
		}

		public String getClassTypeLevel() {
			return this.classTypeLevel;
		}

		public void setClassTypeLevel(String classTypeLevel) {
			this.classTypeLevel = classTypeLevel;
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

		public String getPsl5MaxIOPS() {
			return this.psl5MaxIOPS;
		}

		public void setPsl5MaxIOPS(String psl5MaxIOPS) {
			this.psl5MaxIOPS = psl5MaxIOPS;
		}

		public String getMaxIOPS() {
			return this.maxIOPS;
		}

		public void setMaxIOPS(String maxIOPS) {
			this.maxIOPS = maxIOPS;
		}

		public String getMaxStorageCapacity() {
			return this.maxStorageCapacity;
		}

		public void setMaxStorageCapacity(String maxStorageCapacity) {
			this.maxStorageCapacity = maxStorageCapacity;
		}

		public String getPl1MaxIOPS() {
			return this.pl1MaxIOPS;
		}

		public void setPl1MaxIOPS(String pl1MaxIOPS) {
			this.pl1MaxIOPS = pl1MaxIOPS;
		}

		public String getPl2MaxIOPS() {
			return this.pl2MaxIOPS;
		}

		public void setPl2MaxIOPS(String pl2MaxIOPS) {
			this.pl2MaxIOPS = pl2MaxIOPS;
		}

		public String getPl3MaxIOPS() {
			return this.pl3MaxIOPS;
		}

		public void setPl3MaxIOPS(String pl3MaxIOPS) {
			this.pl3MaxIOPS = pl3MaxIOPS;
		}
	}

	@Override
	public DescribeClassListResponse getInstance(UnmarshallerContext context) {
		return	DescribeClassListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
