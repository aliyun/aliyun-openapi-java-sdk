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
import com.aliyuncs.sas.transform.v20181203.DescribeGroupStructResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupStructResponse extends AcsResponse {

	private String requestId;

	private Long groupId;

	private String groupName;

	private Integer machineNum;

	private Integer groupIndex;

	private Integer groupFather;

	private Integer groupLevel;

	private Integer groupFlag;

	private List<String> groups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getMachineNum() {
		return this.machineNum;
	}

	public void setMachineNum(Integer machineNum) {
		this.machineNum = machineNum;
	}

	public Integer getGroupIndex() {
		return this.groupIndex;
	}

	public void setGroupIndex(Integer groupIndex) {
		this.groupIndex = groupIndex;
	}

	public Integer getGroupFather() {
		return this.groupFather;
	}

	public void setGroupFather(Integer groupFather) {
		this.groupFather = groupFather;
	}

	public Integer getGroupLevel() {
		return this.groupLevel;
	}

	public void setGroupLevel(Integer groupLevel) {
		this.groupLevel = groupLevel;
	}

	public Integer getGroupFlag() {
		return this.groupFlag;
	}

	public void setGroupFlag(Integer groupFlag) {
		this.groupFlag = groupFlag;
	}

	public List<String> getGroups() {
		return this.groups;
	}

	public void setGroups(List<String> groups) {
		this.groups = groups;
	}

	@Override
	public DescribeGroupStructResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupStructResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
