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

package com.aliyuncs.crm.model.v20150408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteLabelForBidRequest extends RpcAcsRequest<DeleteLabelForBidResponse> {
	
	public DeleteLabelForBidRequest() {
		super("Crm", "2015-04-08", "DeleteLabelForBid", "crm");
	}

	private String labelSeries;

	private String pK;

	private String label;

	public String getLabelSeries() {
		return this.labelSeries;
	}

	public void setLabelSeries(String labelSeries) {
		this.labelSeries = labelSeries;
		if(labelSeries != null){
			putQueryParameter("LabelSeries", labelSeries);
		}
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK);
		}
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
		if(label != null){
			putQueryParameter("Label", label);
		}
	}

	@Override
	public Class<DeleteLabelForBidResponse> getResponseClass() {
		return DeleteLabelForBidResponse.class;
	}

}
