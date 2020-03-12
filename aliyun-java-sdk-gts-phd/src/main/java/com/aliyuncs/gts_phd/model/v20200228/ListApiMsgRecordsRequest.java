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

package com.aliyuncs.gts_phd.model.v20200228;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListApiMsgRecordsRequest extends RpcAcsRequest<ListApiMsgRecordsResponse> {
	   

	private String uid;

	private String requestId;

	private String sign;

	private Integer pageSize;

	private String msgId;

	private Integer pageIndex;

	private String ak;

	private String state;

	private String signTimestamp;
	public ListApiMsgRecordsRequest() {
		super("gts-phd", "2020-02-28", "ListApiMsgRecords");
		setMethod(MethodType.GET);
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
		if(sign != null){
			putQueryParameter("Sign", sign);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
		if(msgId != null){
			putQueryParameter("MsgId", msgId);
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getAk() {
		return this.ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
		if(ak != null){
			putQueryParameter("Ak", ak);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getSignTimestamp() {
		return this.signTimestamp;
	}

	public void setSignTimestamp(String signTimestamp) {
		this.signTimestamp = signTimestamp;
		if(signTimestamp != null){
			putQueryParameter("SignTimestamp", signTimestamp);
		}
	}

	@Override
	public Class<ListApiMsgRecordsResponse> getResponseClass() {
		return ListApiMsgRecordsResponse.class;
	}

}
