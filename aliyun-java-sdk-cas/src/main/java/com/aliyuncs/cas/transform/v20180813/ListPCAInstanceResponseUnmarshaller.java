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

package com.aliyuncs.cas.transform.v20180813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180813.ListPCAInstanceResponse;
import com.aliyuncs.cas.model.v20180813.ListPCAInstanceResponse.PCAInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPCAInstanceResponseUnmarshaller {

	public static ListPCAInstanceResponse unmarshall(ListPCAInstanceResponse listPCAInstanceResponse, UnmarshallerContext _ctx) {
		
		listPCAInstanceResponse.setRequestId(_ctx.stringValue("ListPCAInstanceResponse.RequestId"));
		listPCAInstanceResponse.setShowSize(_ctx.longValue("ListPCAInstanceResponse.ShowSize"));
		listPCAInstanceResponse.setCurrentPage(_ctx.longValue("ListPCAInstanceResponse.CurrentPage"));
		listPCAInstanceResponse.setTotalCount(_ctx.longValue("ListPCAInstanceResponse.TotalCount"));

		List<PCAInstance> pCAInstanceList = new ArrayList<PCAInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListPCAInstanceResponse.PCAInstanceList.Length"); i++) {
			PCAInstance pCAInstance = new PCAInstance();
			pCAInstance.setRelateStatus(_ctx.booleanValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].RelateStatus"));
			pCAInstance.setAlgorithm(_ctx.stringValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].Algorithm"));
			pCAInstance.setAliasName(_ctx.stringValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].AliasName"));
			pCAInstance.setIssuedCertCount(_ctx.longValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].IssuedCertCount"));
			pCAInstance.setCertCount(_ctx.longValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].CertCount"));
			pCAInstance.setInstanceUuid(_ctx.stringValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].InstanceUuid"));
			pCAInstance.setEndTime(_ctx.longValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].EndTime"));
			pCAInstance.setCaIdentifier(_ctx.stringValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].CaIdentifier"));
			pCAInstance.setShareFlag(_ctx.integerValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].ShareFlag"));
			pCAInstance.setTrial(_ctx.stringValue("ListPCAInstanceResponse.PCAInstanceList["+ i +"].Trial"));

			pCAInstanceList.add(pCAInstance);
		}
		listPCAInstanceResponse.setPCAInstanceList(pCAInstanceList);
	 
	 	return listPCAInstanceResponse;
	}
}