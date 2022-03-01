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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainsResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainsResponse.Result.AntChainsItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainsResponse.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainsResponseUnmarshaller {

	public static DescribeAntChainsResponse unmarshall(DescribeAntChainsResponse describeAntChainsResponse, UnmarshallerContext _ctx) {
		
		describeAntChainsResponse.setRequestId(_ctx.stringValue("DescribeAntChainsResponse.RequestId"));

		Result result = new Result();
		result.setIsExist(_ctx.booleanValue("DescribeAntChainsResponse.Result.IsExist"));

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainsResponse.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainsResponse.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainsResponse.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<AntChainsItem> antChains = new ArrayList<AntChainsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainsResponse.Result.AntChains.Length"); i++) {
			AntChainsItem antChainsItem = new AntChainsItem();
			antChainsItem.setExpireTime(_ctx.longValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].ExpireTime"));
			antChainsItem.setCreateTime(_ctx.longValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].CreateTime"));
			antChainsItem.setChainType(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].ChainType"));
			antChainsItem.setMemberStatus(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].MemberStatus"));
			antChainsItem.setMerkleTreeSuit(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].MerkleTreeSuit"));
			antChainsItem.setIsAdmin(_ctx.booleanValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].IsAdmin"));
			antChainsItem.setAntChainName(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].AntChainName"));
			antChainsItem.setRegionId(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].RegionId"));
			antChainsItem.setNetwork(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].Network"));
			antChainsItem.setTlsAlgo(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].TlsAlgo"));
			antChainsItem.setVersion(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].Version"));
			antChainsItem.setCipherSuit(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].CipherSuit"));
			antChainsItem.setResourceSize(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].ResourceSize"));
			antChainsItem.setNodeNum(_ctx.integerValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].NodeNum"));
			antChainsItem.setAntChainId(_ctx.stringValue("DescribeAntChainsResponse.Result.AntChains["+ i +"].AntChainId"));

			antChains.add(antChainsItem);
		}
		result.setAntChains(antChains);
		describeAntChainsResponse.setResult(result);
	 
	 	return describeAntChainsResponse;
	}
}