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

package com.aliyuncs.pts.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AdjustRelationSpeedRequest extends RpcAcsRequest<AdjustRelationSpeedResponse> {
	   

	private Integer relationIndex;

	private String sceneId;

	private Integer speed;
	public AdjustRelationSpeedRequest() {
		super("PTS", "2019-08-10", "AdjustRelationSpeed", "1.0.0");
		setMethod(MethodType.POST);
	}

	public Integer getRelationIndex() {
		return this.relationIndex;
	}

	public void setRelationIndex(Integer relationIndex) {
		this.relationIndex = relationIndex;
		if(relationIndex != null){
			putQueryParameter("RelationIndex", relationIndex.toString());
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId);
		}
	}

	public Integer getSpeed() {
		return this.speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
		if(speed != null){
			putQueryParameter("Speed", speed.toString());
		}
	}

	@Override
	public Class<AdjustRelationSpeedResponse> getResponseClass() {
		return AdjustRelationSpeedResponse.class;
	}

}
