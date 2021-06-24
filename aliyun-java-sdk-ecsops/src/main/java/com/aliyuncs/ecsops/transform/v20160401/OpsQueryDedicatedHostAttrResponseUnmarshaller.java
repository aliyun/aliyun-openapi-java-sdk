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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDedicatedHostAttrResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDedicatedHostAttrResponse.DedicatedHostAttr;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDedicatedHostAttrResponseUnmarshaller {

	public static OpsQueryDedicatedHostAttrResponse unmarshall(OpsQueryDedicatedHostAttrResponse opsQueryDedicatedHostAttrResponse, UnmarshallerContext _ctx) {
		
		opsQueryDedicatedHostAttrResponse.setRequestId(_ctx.stringValue("OpsQueryDedicatedHostAttrResponse.RequestId"));

		List<DedicatedHostAttr> dedicatedHostAttrs = new ArrayList<DedicatedHostAttr>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDedicatedHostAttrResponse.DedicatedHostAttrs.Length"); i++) {
			DedicatedHostAttr dedicatedHostAttr = new DedicatedHostAttr();
			dedicatedHostAttr.setIsDeleted(_ctx.stringValue("OpsQueryDedicatedHostAttrResponse.DedicatedHostAttrs["+ i +"].IsDeleted"));
			dedicatedHostAttr.setAttrName(_ctx.stringValue("OpsQueryDedicatedHostAttrResponse.DedicatedHostAttrs["+ i +"].AttrName"));
			dedicatedHostAttr.setDedicatedHostId(_ctx.stringValue("OpsQueryDedicatedHostAttrResponse.DedicatedHostAttrs["+ i +"].DedicatedHostId"));
			dedicatedHostAttr.setAttrVale(_ctx.stringValue("OpsQueryDedicatedHostAttrResponse.DedicatedHostAttrs["+ i +"].AttrVale"));

			dedicatedHostAttrs.add(dedicatedHostAttr);
		}
		opsQueryDedicatedHostAttrResponse.setDedicatedHostAttrs(dedicatedHostAttrs);
	 
	 	return opsQueryDedicatedHostAttrResponse;
	}
}