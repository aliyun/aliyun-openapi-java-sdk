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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class IvrCallRequest extends RpcAcsRequest<IvrCallResponse> {
	   

	private String byeCode;

	private Long resourceOwnerId;

	private String startTtsParams;

	private Integer timeout;

	private String startCode;

	private String calledNumber;

	private String calledShowNumber;

	private List<MenuKeyMap> menuKeyMaps;

	private String resourceOwnerAccount;

	private Long playTimes;

	private Long ownerId;

	private String outId;

	private String byeTtsParams;
	public IvrCallRequest() {
		super("Dyvmsapi", "2017-05-25", "IvrCall", "dyvms");
		setMethod(MethodType.POST);
	}

	public String getByeCode() {
		return this.byeCode;
	}

	public void setByeCode(String byeCode) {
		this.byeCode = byeCode;
		if(byeCode != null){
			putQueryParameter("ByeCode", byeCode);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getStartTtsParams() {
		return this.startTtsParams;
	}

	public void setStartTtsParams(String startTtsParams) {
		this.startTtsParams = startTtsParams;
		if(startTtsParams != null){
			putQueryParameter("StartTtsParams", startTtsParams);
		}
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public String getStartCode() {
		return this.startCode;
	}

	public void setStartCode(String startCode) {
		this.startCode = startCode;
		if(startCode != null){
			putQueryParameter("StartCode", startCode);
		}
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public String getCalledShowNumber() {
		return this.calledShowNumber;
	}

	public void setCalledShowNumber(String calledShowNumber) {
		this.calledShowNumber = calledShowNumber;
		if(calledShowNumber != null){
			putQueryParameter("CalledShowNumber", calledShowNumber);
		}
	}

	public List<MenuKeyMap> getMenuKeyMaps() {
		return this.menuKeyMaps;
	}

	public void setMenuKeyMaps(List<MenuKeyMap> menuKeyMaps) {
		this.menuKeyMaps = menuKeyMaps;	
		if (menuKeyMaps != null) {
			for (int depth1 = 0; depth1 < menuKeyMaps.size(); depth1++) {
				putQueryParameter("MenuKeyMap." + (depth1 + 1) + ".Code" , menuKeyMaps.get(depth1).getCode());
				putQueryParameter("MenuKeyMap." + (depth1 + 1) + ".TtsParams" , menuKeyMaps.get(depth1).getTtsParams());
				putQueryParameter("MenuKeyMap." + (depth1 + 1) + ".Key" , menuKeyMaps.get(depth1).getKey());
			}
		}	
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getPlayTimes() {
		return this.playTimes;
	}

	public void setPlayTimes(Long playTimes) {
		this.playTimes = playTimes;
		if(playTimes != null){
			putQueryParameter("PlayTimes", playTimes.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putQueryParameter("OutId", outId);
		}
	}

	public String getByeTtsParams() {
		return this.byeTtsParams;
	}

	public void setByeTtsParams(String byeTtsParams) {
		this.byeTtsParams = byeTtsParams;
		if(byeTtsParams != null){
			putQueryParameter("ByeTtsParams", byeTtsParams);
		}
	}

	public static class MenuKeyMap {

		private String code;

		private String ttsParams;

		private String key;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getTtsParams() {
			return this.ttsParams;
		}

		public void setTtsParams(String ttsParams) {
			this.ttsParams = ttsParams;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<IvrCallResponse> getResponseClass() {
		return IvrCallResponse.class;
	}

}
