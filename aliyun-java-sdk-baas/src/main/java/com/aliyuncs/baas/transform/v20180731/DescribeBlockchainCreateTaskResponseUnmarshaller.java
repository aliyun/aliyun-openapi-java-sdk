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

import com.aliyuncs.baas.model.v20180731.DescribeBlockchainCreateTaskResponse;
import com.aliyuncs.baas.model.v20180731.DescribeBlockchainCreateTaskResponse.Result;
import com.aliyuncs.baas.model.v20180731.DescribeBlockchainCreateTaskResponse.Result.BlockchainCreateTasksItem;
import com.aliyuncs.baas.model.v20180731.DescribeBlockchainCreateTaskResponse.Result.Pagination;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBlockchainCreateTaskResponseUnmarshaller {

	public static DescribeBlockchainCreateTaskResponse unmarshall(DescribeBlockchainCreateTaskResponse describeBlockchainCreateTaskResponse, UnmarshallerContext context) {
		
		describeBlockchainCreateTaskResponse.setRequestId(context.stringValue("DescribeBlockchainCreateTaskResponse.RequestId"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(context.integerValue("DescribeBlockchainCreateTaskResponse.Result.Pagination.PageSize"));
		pagination.setCurrent(context.integerValue("DescribeBlockchainCreateTaskResponse.Result.Pagination.Current"));
		pagination.setTotal(context.integerValue("DescribeBlockchainCreateTaskResponse.Result.Pagination.Total"));
		result.setPagination(pagination);

		List<BlockchainCreateTasksItem> blockchainCreateTasks = new ArrayList<BlockchainCreateTasksItem>();
		for (int i = 0; i < context.lengthValue("DescribeBlockchainCreateTaskResponse.Result.BlockchainCreateTasks.Length"); i++) {
			BlockchainCreateTasksItem blockchainCreateTasksItem = new BlockchainCreateTasksItem();
			blockchainCreateTasksItem.setBizid(context.stringValue("DescribeBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].Bizid"));
			blockchainCreateTasksItem.setName(context.stringValue("DescribeBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].Name"));
			blockchainCreateTasksItem.setStatus(context.stringValue("DescribeBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].Status"));
			blockchainCreateTasksItem.setMemo(context.stringValue("DescribeBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].Memo"));
			blockchainCreateTasksItem.setCreateTime(context.longValue("DescribeBlockchainCreateTaskResponse.Result.BlockchainCreateTasks["+ i +"].CreateTime"));

			blockchainCreateTasks.add(blockchainCreateTasksItem);
		}
		result.setBlockchainCreateTasks(blockchainCreateTasks);
		describeBlockchainCreateTaskResponse.setResult(result);
	 
	 	return describeBlockchainCreateTaskResponse;
	}
}