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

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForAddingDSRecordRequest extends RpcAcsRequest<SaveSingleTaskForAddingDSRecordResponse> {
	
	public SaveSingleTaskForAddingDSRecordRequest() {
		super("Domain-intl", "2017-12-18", "SaveSingleTaskForAddingDSRecord", "domain");
	}

	private Integer keyTag;

	private String domainName;

	private String userClientIp;

	private Integer digestType;

	private String digest;

	private String lang;

	private Integer algorithm;

	public Integer getKeyTag() {
		return this.keyTag;
	}

	public void setKeyTag(Integer keyTag) {
		this.keyTag = keyTag;
		if(keyTag != null){
			putQueryParameter("KeyTag", keyTag.toString());
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public Integer getDigestType() {
		return this.digestType;
	}

	public void setDigestType(Integer digestType) {
		this.digestType = digestType;
		if(digestType != null){
			putQueryParameter("DigestType", digestType.toString());
		}
	}

	public String getDigest() {
		return this.digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
		if(digest != null){
			putQueryParameter("Digest", digest);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Integer getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(Integer algorithm) {
		this.algorithm = algorithm;
		if(algorithm != null){
			putQueryParameter("Algorithm", algorithm.toString());
		}
	}

	@Override
	public Class<SaveSingleTaskForAddingDSRecordResponse> getResponseClass() {
		return SaveSingleTaskForAddingDSRecordResponse.class;
	}

}
