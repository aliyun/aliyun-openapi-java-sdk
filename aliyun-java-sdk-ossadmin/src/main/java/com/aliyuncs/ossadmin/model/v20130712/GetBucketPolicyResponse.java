/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ossadmin.model.v20130712;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ossadmin.transform.v20130712.GetBucketPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBucketPolicyResponse extends AcsResponse {

	private Boolean disallowEmptyRefer;

	private Boolean enableDualCluster;

	private String errorFile;

	private String indexFile;

	private String location;

	private String logBucket;

	private String logPrefix;

	private String iamPolicy;

	private WhiteReferList whiteReferList;

	public Boolean getDisallowEmptyRefer() {
		return this.disallowEmptyRefer;
	}

	public void setDisallowEmptyRefer(Boolean disallowEmptyRefer) {
		this.disallowEmptyRefer = disallowEmptyRefer;
	}

	public Boolean getEnableDualCluster() {
		return this.enableDualCluster;
	}

	public void setEnableDualCluster(Boolean enableDualCluster) {
		this.enableDualCluster = enableDualCluster;
	}

	public String getErrorFile() {
		return this.errorFile;
	}

	public void setErrorFile(String errorFile) {
		this.errorFile = errorFile;
	}

	public String getIndexFile() {
		return this.indexFile;
	}

	public void setIndexFile(String indexFile) {
		this.indexFile = indexFile;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLogBucket() {
		return this.logBucket;
	}

	public void setLogBucket(String logBucket) {
		this.logBucket = logBucket;
	}

	public String getLogPrefix() {
		return this.logPrefix;
	}

	public void setLogPrefix(String logPrefix) {
		this.logPrefix = logPrefix;
	}

	public String getIamPolicy() {
		return this.iamPolicy;
	}

	public void setIamPolicy(String iamPolicy) {
		this.iamPolicy = iamPolicy;
	}

	public WhiteReferList getWhiteReferList() {
		return this.whiteReferList;
	}

	public void setWhiteReferList(WhiteReferList whiteReferList) {
		this.whiteReferList = whiteReferList;
	}

	public static class WhiteReferList {

		private List<String> referList;

		public List<String> getReferList() {
			return this.referList;
		}

		public void setReferList(List<String> referList) {
			this.referList = referList;
		}
	}

	@Override
	public GetBucketPolicyResponse getInstance(UnmarshallerContext context) {
		return	GetBucketPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
