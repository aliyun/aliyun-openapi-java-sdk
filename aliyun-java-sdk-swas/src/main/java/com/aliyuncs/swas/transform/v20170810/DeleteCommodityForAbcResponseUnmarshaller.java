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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.DeleteCommodityForAbcResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCommodityForAbcResponseUnmarshaller {

	public static DeleteCommodityForAbcResponse unmarshall(DeleteCommodityForAbcResponse deleteCommodityForAbcResponse, UnmarshallerContext _ctx) {
		
		deleteCommodityForAbcResponse.setRequestId(_ctx.stringValue("DeleteCommodityForAbcResponse.RequestId"));
		deleteCommodityForAbcResponse.setCode(_ctx.stringValue("DeleteCommodityForAbcResponse.Code"));
		deleteCommodityForAbcResponse.setMessage(_ctx.stringValue("DeleteCommodityForAbcResponse.Message"));
		deleteCommodityForAbcResponse.setSuccess(_ctx.booleanValue("DeleteCommodityForAbcResponse.Success"));
	 
	 	return deleteCommodityForAbcResponse;
	}
}