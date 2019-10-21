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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainConsortiumsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainConsortiumsResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainConsortiumsResponse.Result.AntConsortiumsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainConsortiumsResponse.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainConsortiumsResponseUnmarshaller {

	public static DescribeAntChainConsortiumsResponse unmarshall(DescribeAntChainConsortiumsResponse describeAntChainConsortiumsResponse, UnmarshallerContext _ctx) {
		
		describeAntChainConsortiumsResponse.setRequestId(_ctx.stringValue("DescribeAntChainConsortiumsResponse.RequestId"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainConsortiumsResponse.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainConsortiumsResponse.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainConsortiumsResponse.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<AntConsortiumsItem> antConsortiums = new ArrayList<AntConsortiumsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainConsortiumsResponse.Result.AntConsortiums.Length"); i++) {
			AntConsortiumsItem antConsortiumsItem = new AntConsortiumsItem();
			antConsortiumsItem.setChainNum(_ctx.longValue("DescribeAntChainConsortiumsResponse.Result.AntConsortiums["+ i +"].ChainNum"));
			antConsortiumsItem.setMemberNum(_ctx.longValue("DescribeAntChainConsortiumsResponse.Result.AntConsortiums["+ i +"].MemberNum"));
			antConsortiumsItem.setCreateTime(_ctx.longValue("DescribeAntChainConsortiumsResponse.Result.AntConsortiums["+ i +"].CreateTime"));
			antConsortiumsItem.setRole(_ctx.stringValue("DescribeAntChainConsortiumsResponse.Result.AntConsortiums["+ i +"].Role"));
			antConsortiumsItem.setConsortiumId(_ctx.stringValue("DescribeAntChainConsortiumsResponse.Result.AntConsortiums["+ i +"].ConsortiumId"));
			antConsortiumsItem.setStatus(_ctx.stringValue("DescribeAntChainConsortiumsResponse.Result.AntConsortiums["+ i +"].Status"));
			antConsortiumsItem.setConsortiumName(_ctx.stringValue("DescribeAntChainConsortiumsResponse.Result.AntConsortiums["+ i +"].ConsortiumName"));
			antConsortiumsItem.setConsortiumDescription(_ctx.stringValue("DescribeAntChainConsortiumsResponse.Result.AntConsortiums["+ i +"].ConsortiumDescription"));

			antConsortiums.add(antConsortiumsItem);
		}
		result.setAntConsortiums(antConsortiums);
		describeAntChainConsortiumsResponse.setResult(result);
	 
	 	return describeAntChainConsortiumsResponse;
	}
}