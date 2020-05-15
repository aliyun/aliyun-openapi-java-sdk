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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.GetHanaInstancesToRestoreResponse;
import com.aliyuncs.hbr.model.v20170908.GetHanaInstancesToRestoreResponse.Hana;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHanaInstancesToRestoreResponseUnmarshaller {

	public static GetHanaInstancesToRestoreResponse unmarshall(GetHanaInstancesToRestoreResponse getHanaInstancesToRestoreResponse, UnmarshallerContext _ctx) {
		
		getHanaInstancesToRestoreResponse.setRequestId(_ctx.stringValue("GetHanaInstancesToRestoreResponse.RequestId"));
		getHanaInstancesToRestoreResponse.setSuccess(_ctx.booleanValue("GetHanaInstancesToRestoreResponse.Success"));
		getHanaInstancesToRestoreResponse.setCode(_ctx.stringValue("GetHanaInstancesToRestoreResponse.Code"));
		getHanaInstancesToRestoreResponse.setMessage(_ctx.stringValue("GetHanaInstancesToRestoreResponse.Message"));
		getHanaInstancesToRestoreResponse.setTotalCount(_ctx.integerValue("GetHanaInstancesToRestoreResponse.TotalCount"));
		getHanaInstancesToRestoreResponse.setPageSize(_ctx.integerValue("GetHanaInstancesToRestoreResponse.PageSize"));
		getHanaInstancesToRestoreResponse.setPageNumber(_ctx.integerValue("GetHanaInstancesToRestoreResponse.PageNumber"));

		List<Hana> hanas = new ArrayList<Hana>();
		for (int i = 0; i < _ctx.lengthValue("GetHanaInstancesToRestoreResponse.Hanas.Length"); i++) {
			Hana hana = new Hana();
			hana.setClusterId(_ctx.stringValue("GetHanaInstancesToRestoreResponse.Hanas["+ i +"].ClusterId"));
			hana.setHanaName(_ctx.stringValue("GetHanaInstancesToRestoreResponse.Hanas["+ i +"].HanaName"));
			hana.setVaultId(_ctx.stringValue("GetHanaInstancesToRestoreResponse.Hanas["+ i +"].VaultId"));
			hana.setHost(_ctx.stringValue("GetHanaInstancesToRestoreResponse.Hanas["+ i +"].Host"));
			hana.setInstanceNumber(_ctx.integerValue("GetHanaInstancesToRestoreResponse.Hanas["+ i +"].InstanceNumber"));

			hanas.add(hana);
		}
		getHanaInstancesToRestoreResponse.setHanas(hanas);
	 
	 	return getHanaInstancesToRestoreResponse;
	}
}