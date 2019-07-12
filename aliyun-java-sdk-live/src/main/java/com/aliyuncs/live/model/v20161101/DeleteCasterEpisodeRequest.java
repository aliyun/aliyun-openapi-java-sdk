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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteCasterEpisodeRequest extends RpcAcsRequest<DeleteCasterEpisodeResponse> {
	
	public DeleteCasterEpisodeRequest() {
		super("live", "2016-11-01", "DeleteCasterEpisode", "live");
	}

	private String casterId;

	private Long ownerId;

	private String episodeId;

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
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

	public String getEpisodeId() {
		return this.episodeId;
	}

	public void setEpisodeId(String episodeId) {
		this.episodeId = episodeId;
		if(episodeId != null){
			putQueryParameter("EpisodeId", episodeId);
		}
	}

	@Override
	public Class<DeleteCasterEpisodeResponse> getResponseClass() {
		return DeleteCasterEpisodeResponse.class;
	}

}
