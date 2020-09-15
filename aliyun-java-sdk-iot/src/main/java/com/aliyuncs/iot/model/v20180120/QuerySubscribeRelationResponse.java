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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QuerySubscribeRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySubscribeRelationResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private String productKey;

	private String type;

	private Boolean deviceDataFlag;

	private Boolean deviceLifeCycleFlag;

	private Boolean deviceStatusChangeFlag;

	private Boolean deviceTopoLifeCycleFlag;

	private Boolean foundDeviceListFlag;

	private Boolean otaEventFlag;

	private Boolean thingHistoryFlag;

	private String mnsConfiguration;

	private Boolean deviceTagFlag;

	private Boolean otaVersionFlag;

	private Boolean otaJobFlag;

	private List<String> consumerGroupIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getDeviceDataFlag() {
		return this.deviceDataFlag;
	}

	public void setDeviceDataFlag(Boolean deviceDataFlag) {
		this.deviceDataFlag = deviceDataFlag;
	}

	public Boolean getDeviceLifeCycleFlag() {
		return this.deviceLifeCycleFlag;
	}

	public void setDeviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
		this.deviceLifeCycleFlag = deviceLifeCycleFlag;
	}

	public Boolean getDeviceStatusChangeFlag() {
		return this.deviceStatusChangeFlag;
	}

	public void setDeviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
		this.deviceStatusChangeFlag = deviceStatusChangeFlag;
	}

	public Boolean getDeviceTopoLifeCycleFlag() {
		return this.deviceTopoLifeCycleFlag;
	}

	public void setDeviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
		this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
	}

	public Boolean getFoundDeviceListFlag() {
		return this.foundDeviceListFlag;
	}

	public void setFoundDeviceListFlag(Boolean foundDeviceListFlag) {
		this.foundDeviceListFlag = foundDeviceListFlag;
	}

	public Boolean getOtaEventFlag() {
		return this.otaEventFlag;
	}

	public void setOtaEventFlag(Boolean otaEventFlag) {
		this.otaEventFlag = otaEventFlag;
	}

	public Boolean getThingHistoryFlag() {
		return this.thingHistoryFlag;
	}

	public void setThingHistoryFlag(Boolean thingHistoryFlag) {
		this.thingHistoryFlag = thingHistoryFlag;
	}

	public String getMnsConfiguration() {
		return this.mnsConfiguration;
	}

	public void setMnsConfiguration(String mnsConfiguration) {
		this.mnsConfiguration = mnsConfiguration;
	}

	public Boolean getDeviceTagFlag() {
		return this.deviceTagFlag;
	}

	public void setDeviceTagFlag(Boolean deviceTagFlag) {
		this.deviceTagFlag = deviceTagFlag;
	}

	public Boolean getOtaVersionFlag() {
		return this.otaVersionFlag;
	}

	public void setOtaVersionFlag(Boolean otaVersionFlag) {
		this.otaVersionFlag = otaVersionFlag;
	}

	public Boolean getOtaJobFlag() {
		return this.otaJobFlag;
	}

	public void setOtaJobFlag(Boolean otaJobFlag) {
		this.otaJobFlag = otaJobFlag;
	}

	public List<String> getConsumerGroupIds() {
		return this.consumerGroupIds;
	}

	public void setConsumerGroupIds(List<String> consumerGroupIds) {
		this.consumerGroupIds = consumerGroupIds;
	}

	@Override
	public QuerySubscribeRelationResponse getInstance(UnmarshallerContext context) {
		return	QuerySubscribeRelationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
