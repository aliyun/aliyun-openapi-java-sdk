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

package com.aliyuncs.agency.transform.v20210609;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20210609.GetPartnerByUidResponse;
import com.aliyuncs.agency.model.v20210609.GetPartnerByUidResponse.Data;
import com.aliyuncs.agency.model.v20210609.GetPartnerByUidResponse.Data.AgreementPropertyRoleDTOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPartnerByUidResponseUnmarshaller {

	public static GetPartnerByUidResponse unmarshall(GetPartnerByUidResponse getPartnerByUidResponse, UnmarshallerContext _ctx) {
		
		getPartnerByUidResponse.setRequestId(_ctx.stringValue("GetPartnerByUidResponse.RequestId"));
		getPartnerByUidResponse.setErrMsg(_ctx.stringValue("GetPartnerByUidResponse.ErrMsg"));
		getPartnerByUidResponse.setSuccess(_ctx.booleanValue("GetPartnerByUidResponse.Success"));
		getPartnerByUidResponse.setErrCode(_ctx.stringValue("GetPartnerByUidResponse.ErrCode"));

		Data data = new Data();
		data.setName(_ctx.stringValue("GetPartnerByUidResponse.Data.Name"));
		data.setPid(_ctx.stringValue("GetPartnerByUidResponse.Data.Pid"));
		data.setUid(_ctx.stringValue("GetPartnerByUidResponse.Data.Uid"));

		List<AgreementPropertyRoleDTOListItem> agreementPropertyRoleDTOList = new ArrayList<AgreementPropertyRoleDTOListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPartnerByUidResponse.Data.AgreementPropertyRoleDTOList.Length"); i++) {
			AgreementPropertyRoleDTOListItem agreementPropertyRoleDTOListItem = new AgreementPropertyRoleDTOListItem();
			agreementPropertyRoleDTOListItem.setAgreementCode(_ctx.stringValue("GetPartnerByUidResponse.Data.AgreementPropertyRoleDTOList["+ i +"].AgreementCode"));

			agreementPropertyRoleDTOList.add(agreementPropertyRoleDTOListItem);
		}
		data.setAgreementPropertyRoleDTOList(agreementPropertyRoleDTOList);
		getPartnerByUidResponse.setData(data);
	 
	 	return getPartnerByUidResponse;
	}
}