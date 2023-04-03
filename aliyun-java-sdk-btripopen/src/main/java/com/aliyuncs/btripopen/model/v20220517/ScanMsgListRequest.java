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

package com.aliyuncs.btripopen.model.v20220517;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ScanMsgListRequest extends RoaAcsRequest<ScanMsgListResponse> {
	   

	private String biz;

	private Integer scanSequence;

	private Integer size;

	private String corpId;

	private String channelType;

	private Long sequenceId;

	private String userId;
	public ScanMsgListRequest() {
		super("btripOpen", "2022-05-17", "ScanMsgList");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/ScanMsgList");
		setMethod(MethodType.POST);
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
		if(biz != null){
			putBodyParameter("Biz", biz);
		}
	}

	public Integer getScanSequence() {
		return this.scanSequence;
	}

	public void setScanSequence(Integer scanSequence) {
		this.scanSequence = scanSequence;
		if(scanSequence != null){
			putBodyParameter("ScanSequence", scanSequence.toString());
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putBodyParameter("Size", size.toString());
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putBodyParameter("ChannelType", channelType);
		}
	}

	public Long getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(Long sequenceId) {
		this.sequenceId = sequenceId;
		if(sequenceId != null){
			putBodyParameter("SequenceId", sequenceId.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	@Override
	public Class<ScanMsgListResponse> getResponseClass() {
		return ScanMsgListResponse.class;
	}

}
