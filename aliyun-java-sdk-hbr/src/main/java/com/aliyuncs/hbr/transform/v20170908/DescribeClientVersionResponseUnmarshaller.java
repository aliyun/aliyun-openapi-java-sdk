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

import com.aliyuncs.hbr.model.v20170908.DescribeClientVersionResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeClientVersionResponse.UpdateOpinion;
import com.aliyuncs.hbr.model.v20170908.DescribeClientVersionResponse.UpdateOpinion.PatchDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClientVersionResponseUnmarshaller {

	public static DescribeClientVersionResponse unmarshall(DescribeClientVersionResponse describeClientVersionResponse, UnmarshallerContext _ctx) {
		
		describeClientVersionResponse.setRequestId(_ctx.stringValue("DescribeClientVersionResponse.RequestId"));
		describeClientVersionResponse.setSuccess(_ctx.booleanValue("DescribeClientVersionResponse.Success"));
		describeClientVersionResponse.setCode(_ctx.stringValue("DescribeClientVersionResponse.Code"));
		describeClientVersionResponse.setMessage(_ctx.stringValue("DescribeClientVersionResponse.Message"));
		describeClientVersionResponse.setMinVersion(_ctx.stringValue("DescribeClientVersionResponse.MinVersion"));
		describeClientVersionResponse.setMaxVersion(_ctx.stringValue("DescribeClientVersionResponse.MaxVersion"));

		UpdateOpinion updateOpinion = new UpdateOpinion();
		updateOpinion.setAction(_ctx.stringValue("DescribeClientVersionResponse.UpdateOpinion.Action"));
		updateOpinion.setVersion(_ctx.stringValue("DescribeClientVersionResponse.UpdateOpinion.Version"));

		List<PatchDetail> patchDetails = new ArrayList<PatchDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClientVersionResponse.UpdateOpinion.PatchDetails.Length"); i++) {
			PatchDetail patchDetail = new PatchDetail();
			patchDetail.setVersion(_ctx.stringValue("DescribeClientVersionResponse.UpdateOpinion.PatchDetails["+ i +"].Version"));
			patchDetail.setFileName(_ctx.stringValue("DescribeClientVersionResponse.UpdateOpinion.PatchDetails["+ i +"].FileName"));
			patchDetail.setSize(_ctx.longValue("DescribeClientVersionResponse.UpdateOpinion.PatchDetails["+ i +"].Size"));
			patchDetail.setUrl(_ctx.stringValue("DescribeClientVersionResponse.UpdateOpinion.PatchDetails["+ i +"].Url"));

			patchDetails.add(patchDetail);
		}
		updateOpinion.setPatchDetails(patchDetails);
		describeClientVersionResponse.setUpdateOpinion(updateOpinion);
	 
	 	return describeClientVersionResponse;
	}
}