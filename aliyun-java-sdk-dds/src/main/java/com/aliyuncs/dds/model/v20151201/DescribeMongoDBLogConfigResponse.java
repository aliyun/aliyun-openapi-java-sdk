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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeMongoDBLogConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMongoDBLogConfigResponse extends AcsResponse {

	private Boolean enableAudit;

	private String requestId;

	private Integer isUserProjectLogstoreExist;

	private Long preserveStorageForTrail;

	private Long usedStorageForStandard;

	private Long hotTtlForV2Standard;

	private Long ttlForStandard;

	private Long preserveStorageForStandard;

	private String userProjectName;

	private String serviceType;

	private Long usedStorageForTrail;

	private Long ttlForV2Standard;

	private Integer isEtlMetaExist;

	private Long ttlForTrail;

	public Boolean getEnableAudit() {
		return this.enableAudit;
	}

	public void setEnableAudit(Boolean enableAudit) {
		this.enableAudit = enableAudit;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getIsUserProjectLogstoreExist() {
		return this.isUserProjectLogstoreExist;
	}

	public void setIsUserProjectLogstoreExist(Integer isUserProjectLogstoreExist) {
		this.isUserProjectLogstoreExist = isUserProjectLogstoreExist;
	}

	public Long getPreserveStorageForTrail() {
		return this.preserveStorageForTrail;
	}

	public void setPreserveStorageForTrail(Long preserveStorageForTrail) {
		this.preserveStorageForTrail = preserveStorageForTrail;
	}

	public Long getUsedStorageForStandard() {
		return this.usedStorageForStandard;
	}

	public void setUsedStorageForStandard(Long usedStorageForStandard) {
		this.usedStorageForStandard = usedStorageForStandard;
	}

	public Long getHotTtlForV2Standard() {
		return this.hotTtlForV2Standard;
	}

	public void setHotTtlForV2Standard(Long hotTtlForV2Standard) {
		this.hotTtlForV2Standard = hotTtlForV2Standard;
	}

	public Long getTtlForStandard() {
		return this.ttlForStandard;
	}

	public void setTtlForStandard(Long ttlForStandard) {
		this.ttlForStandard = ttlForStandard;
	}

	public Long getPreserveStorageForStandard() {
		return this.preserveStorageForStandard;
	}

	public void setPreserveStorageForStandard(Long preserveStorageForStandard) {
		this.preserveStorageForStandard = preserveStorageForStandard;
	}

	public String getUserProjectName() {
		return this.userProjectName;
	}

	public void setUserProjectName(String userProjectName) {
		this.userProjectName = userProjectName;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Long getUsedStorageForTrail() {
		return this.usedStorageForTrail;
	}

	public void setUsedStorageForTrail(Long usedStorageForTrail) {
		this.usedStorageForTrail = usedStorageForTrail;
	}

	public Long getTtlForV2Standard() {
		return this.ttlForV2Standard;
	}

	public void setTtlForV2Standard(Long ttlForV2Standard) {
		this.ttlForV2Standard = ttlForV2Standard;
	}

	public Integer getIsEtlMetaExist() {
		return this.isEtlMetaExist;
	}

	public void setIsEtlMetaExist(Integer isEtlMetaExist) {
		this.isEtlMetaExist = isEtlMetaExist;
	}

	public Long getTtlForTrail() {
		return this.ttlForTrail;
	}

	public void setTtlForTrail(Long ttlForTrail) {
		this.ttlForTrail = ttlForTrail;
	}

	@Override
	public DescribeMongoDBLogConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeMongoDBLogConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
