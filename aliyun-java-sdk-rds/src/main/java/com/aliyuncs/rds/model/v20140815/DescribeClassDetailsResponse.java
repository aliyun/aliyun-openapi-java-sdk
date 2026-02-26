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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeClassDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClassDetailsResponse extends AcsResponse {

	private String category;

	private String classCode;

	private String classGroup;

	private String cpu;

	private String dBInstanceStorageType;

	private String instructionSetArch;

	private String maxConnections;

	private String maxIOMBPS;

	private String maxIOPS;

	private String memoryClass;

	private String referencePrice;

	private String requestId;

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getCpu() {
		return this.cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getDBInstanceStorageType() {
		return this.dBInstanceStorageType;
	}

	public void setDBInstanceStorageType(String dBInstanceStorageType) {
		this.dBInstanceStorageType = dBInstanceStorageType;
	}

	public String getInstructionSetArch() {
		return this.instructionSetArch;
	}

	public void setInstructionSetArch(String instructionSetArch) {
		this.instructionSetArch = instructionSetArch;
	}

	public String getMaxConnections() {
		return this.maxConnections;
	}

	public void setMaxConnections(String maxConnections) {
		this.maxConnections = maxConnections;
	}

	public String getMaxIOMBPS() {
		return this.maxIOMBPS;
	}

	public void setMaxIOMBPS(String maxIOMBPS) {
		this.maxIOMBPS = maxIOMBPS;
	}

	public String getMaxIOPS() {
		return this.maxIOPS;
	}

	public void setMaxIOPS(String maxIOPS) {
		this.maxIOPS = maxIOPS;
	}

	public String getMemoryClass() {
		return this.memoryClass;
	}

	public void setMemoryClass(String memoryClass) {
		this.memoryClass = memoryClass;
	}

	public String getReferencePrice() {
		return this.referencePrice;
	}

	public void setReferencePrice(String referencePrice) {
		this.referencePrice = referencePrice;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public DescribeClassDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeClassDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
