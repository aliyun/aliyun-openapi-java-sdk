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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDevicePictureByListRequest extends RpcAcsRequest<QueryDevicePictureByListResponse> {
	   

	private Integer pictureType;

	private Integer thumbWidth;

	private String iotId;

	private String iotInstanceId;

	private List<String> pictureIdLists;

	private Integer expireTime;

	private String productKey;

	private String deviceName;
	public QueryDevicePictureByListRequest() {
		super("Linkvisual", "2018-01-20", "QueryDevicePictureByList", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPictureType() {
		return this.pictureType;
	}

	public void setPictureType(Integer pictureType) {
		this.pictureType = pictureType;
		if(pictureType != null){
			putQueryParameter("PictureType", pictureType.toString());
		}
	}

	public Integer getThumbWidth() {
		return this.thumbWidth;
	}

	public void setThumbWidth(Integer thumbWidth) {
		this.thumbWidth = thumbWidth;
		if(thumbWidth != null){
			putQueryParameter("ThumbWidth", thumbWidth.toString());
		}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public List<String> getPictureIdLists() {
		return this.pictureIdLists;
	}

	public void setPictureIdLists(List<String> pictureIdLists) {
		this.pictureIdLists = pictureIdLists;	
		if (pictureIdLists != null) {
			for (int i = 0; i < pictureIdLists.size(); i++) {
				putQueryParameter("PictureIdList." + (i + 1) , pictureIdLists.get(i));
			}
		}	
	}

	public Integer getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putQueryParameter("ExpireTime", expireTime.toString());
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
		}
	}

	@Override
	public Class<QueryDevicePictureByListResponse> getResponseClass() {
		return QueryDevicePictureByListResponse.class;
	}

}
