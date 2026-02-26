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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TextEmbeddingRequest extends RpcAcsRequest<TextEmbeddingResponse> {
	   

	private String dBInstanceId;

	private String model;

	private Integer dimension;

	private Long ownerId;

	@SerializedName("input")
	private List<String> input;
	public TextEmbeddingRequest() {
		super("gpdb", "2016-05-03", "TextEmbedding", "gpdb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	public Integer getDimension() {
		return this.dimension;
	}

	public void setDimension(Integer dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putQueryParameter("Dimension", dimension.toString());
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

	public List<String> getInput() {
		return this.input;
	}

	public void setInput(List<String> input) {
		this.input = input;	
		if (input != null) {
			putBodyParameter("Input" , new Gson().toJson(input));
		}	
	}

	@Override
	public Class<TextEmbeddingResponse> getResponseClass() {
		return TextEmbeddingResponse.class;
	}

}
