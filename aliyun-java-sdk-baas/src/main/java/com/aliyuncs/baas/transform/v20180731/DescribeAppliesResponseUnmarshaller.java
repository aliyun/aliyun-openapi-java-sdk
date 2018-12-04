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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeAppliesResponse;
import com.aliyuncs.baas.model.v20180731.DescribeAppliesResponse.Result;
import com.aliyuncs.baas.model.v20180731.DescribeAppliesResponse.Result.ApplyHistoryListItem;
import com.aliyuncs.baas.model.v20180731.DescribeAppliesResponse.Result.Pagination;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppliesResponseUnmarshaller {

	public static DescribeAppliesResponse unmarshall(DescribeAppliesResponse describeAppliesResponse, UnmarshallerContext context) {
		
		describeAppliesResponse.setRequestId(context.stringValue("DescribeAppliesResponse.RequestId"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(context.integerValue("DescribeAppliesResponse.Result.Pagination.PageSize"));
		pagination.setCurrent(context.integerValue("DescribeAppliesResponse.Result.Pagination.Current"));
		pagination.setTotal(context.integerValue("DescribeAppliesResponse.Result.Pagination.Total"));
		result.setPagination(pagination);

		List<ApplyHistoryListItem> applyHistoryList = new ArrayList<ApplyHistoryListItem>();
		for (int i = 0; i < context.lengthValue("DescribeAppliesResponse.Result.ApplyHistoryList.Length"); i++) {
			ApplyHistoryListItem applyHistoryListItem = new ApplyHistoryListItem();
			applyHistoryListItem.setId(context.integerValue("DescribeAppliesResponse.Result.ApplyHistoryList["+ i +"].Id"));
			applyHistoryListItem.setBizid(context.stringValue("DescribeAppliesResponse.Result.ApplyHistoryList["+ i +"].Bizid"));
			applyHistoryListItem.setUsername(context.stringValue("DescribeAppliesResponse.Result.ApplyHistoryList["+ i +"].Username"));
			applyHistoryListItem.setReqAddr(context.stringValue("DescribeAppliesResponse.Result.ApplyHistoryList["+ i +"].ReqAddr"));
			applyHistoryListItem.setSignedAddr(context.stringValue("DescribeAppliesResponse.Result.ApplyHistoryList["+ i +"].SignedAddr"));
			applyHistoryListItem.setStatus(context.integerValue("DescribeAppliesResponse.Result.ApplyHistoryList["+ i +"].Status"));
			applyHistoryListItem.setRejectReason(context.stringValue("DescribeAppliesResponse.Result.ApplyHistoryList["+ i +"].RejectReason"));
			applyHistoryListItem.setCreatetime(context.longValue("DescribeAppliesResponse.Result.ApplyHistoryList["+ i +"].Createtime"));
			applyHistoryListItem.setUpdatetime(context.longValue("DescribeAppliesResponse.Result.ApplyHistoryList["+ i +"].Updatetime"));

			applyHistoryList.add(applyHistoryListItem);
		}
		result.setApplyHistoryList(applyHistoryList);
		describeAppliesResponse.setResult(result);
	 
	 	return describeAppliesResponse;
	}
}