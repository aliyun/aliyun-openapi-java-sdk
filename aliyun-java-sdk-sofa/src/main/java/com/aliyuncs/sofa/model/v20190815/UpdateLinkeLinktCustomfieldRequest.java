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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeLinktCustomfieldRequest extends RpcAcsRequest<UpdateLinkeLinktCustomfieldResponse> {
	   

	private String description;

	private String type;

	private Long id;

	private String projectSign;

	private String fieldLabel;

	private String name;

	private String fieldFormat;

	private List<String> possibleValuesRepeatLists;
	public UpdateLinkeLinktCustomfieldRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktCustomfield", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getProjectSign() {
		return this.projectSign;
	}

	public void setProjectSign(String projectSign) {
		this.projectSign = projectSign;
		if(projectSign != null){
			putBodyParameter("ProjectSign", projectSign);
		}
	}

	public String getFieldLabel() {
		return this.fieldLabel;
	}

	public void setFieldLabel(String fieldLabel) {
		this.fieldLabel = fieldLabel;
		if(fieldLabel != null){
			putBodyParameter("FieldLabel", fieldLabel);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getFieldFormat() {
		return this.fieldFormat;
	}

	public void setFieldFormat(String fieldFormat) {
		this.fieldFormat = fieldFormat;
		if(fieldFormat != null){
			putBodyParameter("FieldFormat", fieldFormat);
		}
	}

	public List<String> getPossibleValuesRepeatLists() {
		return this.possibleValuesRepeatLists;
	}

	public void setPossibleValuesRepeatLists(List<String> possibleValuesRepeatLists) {
		this.possibleValuesRepeatLists = possibleValuesRepeatLists;	
		if (possibleValuesRepeatLists != null) {
			for (int i = 0; i < possibleValuesRepeatLists.size(); i++) {
				putBodyParameter("PossibleValuesRepeatList." + (i + 1) , possibleValuesRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<UpdateLinkeLinktCustomfieldResponse> getResponseClass() {
		return UpdateLinkeLinktCustomfieldResponse.class;
	}

}
