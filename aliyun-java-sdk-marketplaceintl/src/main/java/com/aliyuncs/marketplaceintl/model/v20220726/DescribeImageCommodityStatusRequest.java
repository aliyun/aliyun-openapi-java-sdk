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

package com.aliyuncs.marketplaceintl.model.v20220726;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageCommodityStatusRequest extends RpcAcsRequest<DescribeImageCommodityStatusResponse> {
	   

	private String uid;

	private String requestId;

	private String encryptData;

	private String commodityCode;
	public DescribeImageCommodityStatusRequest() {
		super("marketplaceIntl", "2022-07-26", "DescribeImageCommodityStatus");
		setMethod(MethodType.POST);
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putBodyParameter("Uid", uid);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putBodyParameter("RequestId", requestId);
		}
	}

	public String getEncryptData() {
		return this.encryptData;
	}

	public void setEncryptData(String encryptData) {
		this.encryptData = encryptData;
		if(encryptData != null){
			putBodyParameter("EncryptData", encryptData);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putBodyParameter("CommodityCode", commodityCode);
		}
	}

	@Override
	public Class<DescribeImageCommodityStatusResponse> getResponseClass() {
		return DescribeImageCommodityStatusResponse.class;
	}

}
