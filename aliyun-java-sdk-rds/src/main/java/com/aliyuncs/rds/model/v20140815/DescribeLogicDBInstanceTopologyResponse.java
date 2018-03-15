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
import com.aliyuncs.rds.transform.v20140815.DescribeLogicDBInstanceTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogicDBInstanceTopologyResponse extends AcsResponse {

	private Integer dBInstanceId;

	private String dBInstanceName;

	private Integer dBInstanceStatus;

	private String dBInstanceStatusDesc;

	private String dBInstanceConnType;

	private String dBInstanceDescription;

	private String engine;

	private String engineVersion;

	private List<LogicDBInstanceParameter> items;

	public Integer getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(Integer dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public Integer getDBInstanceStatus() {
		return this.dBInstanceStatus;
	}

	public void setDBInstanceStatus(Integer dBInstanceStatus) {
		this.dBInstanceStatus = dBInstanceStatus;
	}

	public String getDBInstanceStatusDesc() {
		return this.dBInstanceStatusDesc;
	}

	public void setDBInstanceStatusDesc(String dBInstanceStatusDesc) {
		this.dBInstanceStatusDesc = dBInstanceStatusDesc;
	}

	public String getDBInstanceConnType() {
		return this.dBInstanceConnType;
	}

	public void setDBInstanceConnType(String dBInstanceConnType) {
		this.dBInstanceConnType = dBInstanceConnType;
	}

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public List<LogicDBInstanceParameter> getItems() {
		return this.items;
	}

	public void setItems(List<LogicDBInstanceParameter> items) {
		this.items = items;
	}

	public static class LogicDBInstanceParameter {

		private Integer dBInstanceID;

		private String dBInstanceName;

		private Integer dBInstanceStatus;

		private String dBInstanceStatusDesc;

		private String dBInstanceConnType;

		private String dBInstanceDescription;

		private String engine;

		private String engineVersion;

		private String characterType;

		public Integer getDBInstanceID() {
			return this.dBInstanceID;
		}

		public void setDBInstanceID(Integer dBInstanceID) {
			this.dBInstanceID = dBInstanceID;
		}

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public Integer getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(Integer dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getDBInstanceStatusDesc() {
			return this.dBInstanceStatusDesc;
		}

		public void setDBInstanceStatusDesc(String dBInstanceStatusDesc) {
			this.dBInstanceStatusDesc = dBInstanceStatusDesc;
		}

		public String getDBInstanceConnType() {
			return this.dBInstanceConnType;
		}

		public void setDBInstanceConnType(String dBInstanceConnType) {
			this.dBInstanceConnType = dBInstanceConnType;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getCharacterType() {
			return this.characterType;
		}

		public void setCharacterType(String characterType) {
			this.characterType = characterType;
		}
	}

	@Override
	public DescribeLogicDBInstanceTopologyResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogicDBInstanceTopologyResponseUnmarshaller.unmarshall(this, context);
	}
}
