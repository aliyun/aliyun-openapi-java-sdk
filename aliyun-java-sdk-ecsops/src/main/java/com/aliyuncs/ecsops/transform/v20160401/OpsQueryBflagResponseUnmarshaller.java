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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryBflagResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryBflagResponse.EcsBidRelItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryBflagResponseUnmarshaller {

	public static OpsQueryBflagResponse unmarshall(OpsQueryBflagResponse opsQueryBflagResponse, UnmarshallerContext _ctx) {
		
		opsQueryBflagResponse.setRequestId(_ctx.stringValue("OpsQueryBflagResponse.RequestId"));
		opsQueryBflagResponse.setTotalCount(_ctx.integerValue("OpsQueryBflagResponse.TotalCount"));
		opsQueryBflagResponse.setPageNumber(_ctx.integerValue("OpsQueryBflagResponse.PageNumber"));
		opsQueryBflagResponse.setPageSize(_ctx.integerValue("OpsQueryBflagResponse.PageSize"));

		List<EcsBidRelItem> ecsBidRel = new ArrayList<EcsBidRelItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryBflagResponse.EcsBidRel.Length"); i++) {
			EcsBidRelItem ecsBidRelItem = new EcsBidRelItem();
			ecsBidRelItem.setId(_ctx.longValue("OpsQueryBflagResponse.EcsBidRel["+ i +"].Id"));
			ecsBidRelItem.setAliUid(_ctx.longValue("OpsQueryBflagResponse.EcsBidRel["+ i +"].AliUid"));
			ecsBidRelItem.setBid(_ctx.stringValue("OpsQueryBflagResponse.EcsBidRel["+ i +"].Bid"));
			ecsBidRelItem.setBflag(_ctx.stringValue("OpsQueryBflagResponse.EcsBidRel["+ i +"].Bflag"));
			ecsBidRelItem.setRemark(_ctx.stringValue("OpsQueryBflagResponse.EcsBidRel["+ i +"].Remark"));
			ecsBidRelItem.setParentBflag(_ctx.stringValue("OpsQueryBflagResponse.EcsBidRel["+ i +"].ParentBflag"));

			ecsBidRel.add(ecsBidRelItem);
		}
		opsQueryBflagResponse.setEcsBidRel(ecsBidRel);
	 
	 	return opsQueryBflagResponse;
	}
}