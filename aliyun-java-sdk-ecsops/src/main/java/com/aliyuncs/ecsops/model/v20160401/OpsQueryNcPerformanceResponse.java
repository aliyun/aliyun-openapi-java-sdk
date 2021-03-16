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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryNcPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryNcPerformanceResponse extends AcsResponse {

	private NcPerInfo ncPerInfo;

	public NcPerInfo getNcPerInfo() {
		return this.ncPerInfo;
	}

	public void setNcPerInfo(NcPerInfo ncPerInfo) {
		this.ncPerInfo = ncPerInfo;
	}

	public static class NcPerInfo {

		private List<CpuException> cpuExceptions;

		private List<DiskException> diskExceptions;

		private List<NetworkException> networkExceptions;

		public List<CpuException> getCpuExceptions() {
			return this.cpuExceptions;
		}

		public void setCpuExceptions(List<CpuException> cpuExceptions) {
			this.cpuExceptions = cpuExceptions;
		}

		public List<DiskException> getDiskExceptions() {
			return this.diskExceptions;
		}

		public void setDiskExceptions(List<DiskException> diskExceptions) {
			this.diskExceptions = diskExceptions;
		}

		public List<NetworkException> getNetworkExceptions() {
			return this.networkExceptions;
		}

		public void setNetworkExceptions(List<NetworkException> networkExceptions) {
			this.networkExceptions = networkExceptions;
		}

		public static class CpuException {

			private String unit;

			private String slsKey;

			private Boolean isPrimary;

			private String level;

			private String name;

			private String description;

			private String exceptionDesc;

			private String category;

			private String perfValue;

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}

			public String getSlsKey() {
				return this.slsKey;
			}

			public void setSlsKey(String slsKey) {
				this.slsKey = slsKey;
			}

			public Boolean getIsPrimary() {
				return this.isPrimary;
			}

			public void setIsPrimary(Boolean isPrimary) {
				this.isPrimary = isPrimary;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getExceptionDesc() {
				return this.exceptionDesc;
			}

			public void setExceptionDesc(String exceptionDesc) {
				this.exceptionDesc = exceptionDesc;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getPerfValue() {
				return this.perfValue;
			}

			public void setPerfValue(String perfValue) {
				this.perfValue = perfValue;
			}
		}

		public static class DiskException {

			private String unit;

			private String slsKey;

			private Boolean isPrimary;

			private String level;

			private String name;

			private String description;

			private String exceptionDesc;

			private String category;

			private String perfValue;

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}

			public String getSlsKey() {
				return this.slsKey;
			}

			public void setSlsKey(String slsKey) {
				this.slsKey = slsKey;
			}

			public Boolean getIsPrimary() {
				return this.isPrimary;
			}

			public void setIsPrimary(Boolean isPrimary) {
				this.isPrimary = isPrimary;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getExceptionDesc() {
				return this.exceptionDesc;
			}

			public void setExceptionDesc(String exceptionDesc) {
				this.exceptionDesc = exceptionDesc;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getPerfValue() {
				return this.perfValue;
			}

			public void setPerfValue(String perfValue) {
				this.perfValue = perfValue;
			}
		}

		public static class NetworkException {

			private String unit;

			private String slsKey;

			private Boolean isPrimary;

			private String level;

			private String name;

			private String description;

			private String exceptionDesc;

			private String category;

			private String perfValue;

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}

			public String getSlsKey() {
				return this.slsKey;
			}

			public void setSlsKey(String slsKey) {
				this.slsKey = slsKey;
			}

			public Boolean getIsPrimary() {
				return this.isPrimary;
			}

			public void setIsPrimary(Boolean isPrimary) {
				this.isPrimary = isPrimary;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getExceptionDesc() {
				return this.exceptionDesc;
			}

			public void setExceptionDesc(String exceptionDesc) {
				this.exceptionDesc = exceptionDesc;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getPerfValue() {
				return this.perfValue;
			}

			public void setPerfValue(String perfValue) {
				this.perfValue = perfValue;
			}
		}
	}

	@Override
	public OpsQueryNcPerformanceResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryNcPerformanceResponseUnmarshaller.unmarshall(this, context);
	}
}
