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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.ModifyACLRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyACLRuleResponse extends AcsResponse {

	private String requestId;

	private String acrId;

	private String aclId;

	private String description;

	private String direction;

	private String sourceCidr;

	private String destCidr;

	private String ipProtocol;

	private String sourcePortRange;

	private String destPortRange;

	private String policy;

	private Integer priority;

	private Long gmtCreate;

	private String name;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAcrId() {
		return this.acrId;
	}

	public void setAcrId(String acrId) {
		this.acrId = acrId;
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getSourceCidr() {
		return this.sourceCidr;
	}

	public void setSourceCidr(String sourceCidr) {
		this.sourceCidr = sourceCidr;
	}

	public String getDestCidr() {
		return this.destCidr;
	}

	public void setDestCidr(String destCidr) {
		this.destCidr = destCidr;
	}

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
	}

	public String getSourcePortRange() {
		return this.sourcePortRange;
	}

	public void setSourcePortRange(String sourcePortRange) {
		this.sourcePortRange = sourcePortRange;
	}

	public String getDestPortRange() {
		return this.destPortRange;
	}

	public void setDestPortRange(String destPortRange) {
		this.destPortRange = destPortRange;
	}

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Long getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Long gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public ModifyACLRuleResponse getInstance(UnmarshallerContext context) {
		return	ModifyACLRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
