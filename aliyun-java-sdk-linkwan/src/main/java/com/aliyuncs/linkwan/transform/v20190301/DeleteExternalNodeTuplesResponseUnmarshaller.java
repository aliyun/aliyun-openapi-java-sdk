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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.DeleteExternalNodeTuplesResponse;
import com.aliyuncs.linkwan.model.v20190301.DeleteExternalNodeTuplesResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.DeleteExternalNodeTuplesResponse.Data.FailedDetailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteExternalNodeTuplesResponseUnmarshaller {

	public static DeleteExternalNodeTuplesResponse unmarshall(DeleteExternalNodeTuplesResponse deleteExternalNodeTuplesResponse, UnmarshallerContext _ctx) {
		
		deleteExternalNodeTuplesResponse.setRequestId(_ctx.stringValue("DeleteExternalNodeTuplesResponse.RequestId"));
		deleteExternalNodeTuplesResponse.setSuccess(_ctx.booleanValue("DeleteExternalNodeTuplesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DeleteExternalNodeTuplesResponse.Data.TotalCount"));
		data.setSuccessCount(_ctx.longValue("DeleteExternalNodeTuplesResponse.Data.SuccessCount"));
		data.setFailedCount(_ctx.longValue("DeleteExternalNodeTuplesResponse.Data.FailedCount"));

		List<FailedDetailsItem> failedDetails = new ArrayList<FailedDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteExternalNodeTuplesResponse.Data.FailedDetails.Length"); i++) {
			FailedDetailsItem failedDetailsItem = new FailedDetailsItem();
			failedDetailsItem.setDevEui(_ctx.stringValue("DeleteExternalNodeTuplesResponse.Data.FailedDetails["+ i +"].DevEui"));
			failedDetailsItem.setOperationResult(_ctx.stringValue("DeleteExternalNodeTuplesResponse.Data.FailedDetails["+ i +"].OperationResult"));

			failedDetails.add(failedDetailsItem);
		}
		data.setFailedDetails(failedDetails);
		deleteExternalNodeTuplesResponse.setData(data);
	 
	 	return deleteExternalNodeTuplesResponse;
	}
}