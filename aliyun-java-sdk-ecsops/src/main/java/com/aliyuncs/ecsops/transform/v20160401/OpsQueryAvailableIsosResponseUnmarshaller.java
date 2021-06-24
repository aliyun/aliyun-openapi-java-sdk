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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryAvailableIsosResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryAvailableIsosResponse.Iso;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryAvailableIsosResponseUnmarshaller {

	public static OpsQueryAvailableIsosResponse unmarshall(OpsQueryAvailableIsosResponse opsQueryAvailableIsosResponse, UnmarshallerContext _ctx) {
		
		opsQueryAvailableIsosResponse.setRequestId(_ctx.stringValue("OpsQueryAvailableIsosResponse.RequestId"));
		opsQueryAvailableIsosResponse.setTotalCount(_ctx.integerValue("OpsQueryAvailableIsosResponse.TotalCount"));
		opsQueryAvailableIsosResponse.setPageSize(_ctx.integerValue("OpsQueryAvailableIsosResponse.PageSize"));
		opsQueryAvailableIsosResponse.setPageNumber(_ctx.integerValue("OpsQueryAvailableIsosResponse.PageNumber"));

		List<Iso> isos = new ArrayList<Iso>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryAvailableIsosResponse.Isos.Length"); i++) {
			Iso iso = new Iso();
			iso.setIsoId(_ctx.stringValue("OpsQueryAvailableIsosResponse.Isos["+ i +"].IsoId"));
			iso.setIsoName(_ctx.stringValue("OpsQueryAvailableIsosResponse.Isos["+ i +"].IsoName"));

			isos.add(iso);
		}
		opsQueryAvailableIsosResponse.setIsos(isos);
	 
	 	return opsQueryAvailableIsosResponse;
	}
}