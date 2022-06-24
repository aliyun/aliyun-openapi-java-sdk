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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckUserFinishAdRequest extends RpcAcsRequest<CheckUserFinishAdResponse> {
	   

	private String uid;

	private Long adid;

	private String tagid;

	private String clicklink;

	private String id;

	private String mediaid;
	public CheckUserFinishAdRequest() {
		super("UniMkt", "2018-12-12", "CheckUserFinishAd", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getAdid() {
		return this.adid;
	}

	public void setAdid(Long adid) {
		this.adid = adid;
		if(adid != null){
			putQueryParameter("Adid", adid.toString());
		}
	}

	public String getTagid() {
		return this.tagid;
	}

	public void setTagid(String tagid) {
		this.tagid = tagid;
		if(tagid != null){
			putQueryParameter("Tagid", tagid);
		}
	}

	public String getClicklink() {
		return this.clicklink;
	}

	public void setClicklink(String clicklink) {
		this.clicklink = clicklink;
		if(clicklink != null){
			putQueryParameter("Clicklink", clicklink);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getMediaid() {
		return this.mediaid;
	}

	public void setMediaid(String mediaid) {
		this.mediaid = mediaid;
		if(mediaid != null){
			putQueryParameter("Mediaid", mediaid);
		}
	}

	@Override
	public Class<CheckUserFinishAdResponse> getResponseClass() {
		return CheckUserFinishAdResponse.class;
	}

}
