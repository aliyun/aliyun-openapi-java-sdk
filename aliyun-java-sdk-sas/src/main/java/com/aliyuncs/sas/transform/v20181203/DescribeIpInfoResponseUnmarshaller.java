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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeIpInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpInfoResponseUnmarshaller {

	public static DescribeIpInfoResponse unmarshall(DescribeIpInfoResponse describeIpInfoResponse, UnmarshallerContext _ctx) {
		
		describeIpInfoResponse.setRequestId(_ctx.stringValue("DescribeIpInfoResponse.RequestId"));
		describeIpInfoResponse.setIp(_ctx.stringValue("DescribeIpInfoResponse.ip"));
		describeIpInfoResponse.setGeo(_ctx.stringValue("DescribeIpInfoResponse.geo"));
		describeIpInfoResponse.setIs_proxy(_ctx.stringValue("DescribeIpInfoResponse.is_proxy"));
		describeIpInfoResponse.setGmt_last_tor(_ctx.stringValue("DescribeIpInfoResponse.gmt_last_tor"));
		describeIpInfoResponse.setTor_day_trace(_ctx.stringValue("DescribeIpInfoResponse.tor_day_trace"));
		describeIpInfoResponse.setTotal_day_cnt_tor(_ctx.stringValue("DescribeIpInfoResponse.total_day_cnt_tor"));
		describeIpInfoResponse.setDay_cnt_7d_tor(_ctx.stringValue("DescribeIpInfoResponse.day_cnt_7d_tor"));
		describeIpInfoResponse.setDay_cnt_30d_tor(_ctx.stringValue("DescribeIpInfoResponse.day_cnt_30d_tor"));
		describeIpInfoResponse.setIs_tor(_ctx.stringValue("DescribeIpInfoResponse.is_tor"));
		describeIpInfoResponse.setGmt_last_web_attack(_ctx.stringValue("DescribeIpInfoResponse.gmt_last_web_attack"));
		describeIpInfoResponse.setWeb_attack_day_trace(_ctx.stringValue("DescribeIpInfoResponse.web_attack_day_trace"));
		describeIpInfoResponse.setTotal_day_cnt_web_attack(_ctx.stringValue("DescribeIpInfoResponse.total_day_cnt_web_attack"));
		describeIpInfoResponse.setDay_cnt_7d_web_attack(_ctx.stringValue("DescribeIpInfoResponse.day_cnt_7d_web_attack"));
		describeIpInfoResponse.setDay_cnt_30d_web_attack(_ctx.stringValue("DescribeIpInfoResponse.day_cnt_30d_web_attack"));
		describeIpInfoResponse.setIs_web_attack(_ctx.stringValue("DescribeIpInfoResponse.is_web_attack"));
		describeIpInfoResponse.setGmt_last_proxy(_ctx.stringValue("DescribeIpInfoResponse.gmt_last_proxy"));
		describeIpInfoResponse.setProxy_day_trace(_ctx.stringValue("DescribeIpInfoResponse.proxy_day_trace"));
		describeIpInfoResponse.setIs_proxy_1d(_ctx.stringValue("DescribeIpInfoResponse.is_proxy_1d"));
		describeIpInfoResponse.setIs_proxy_7d(_ctx.stringValue("DescribeIpInfoResponse.is_proxy_7d"));
		describeIpInfoResponse.setIs_tor_1d(_ctx.stringValue("DescribeIpInfoResponse.is_tor_1d"));
		describeIpInfoResponse.setIs_tor_7d(_ctx.stringValue("DescribeIpInfoResponse.is_tor_7d"));
		describeIpInfoResponse.setIs_web_attack_1d(_ctx.stringValue("DescribeIpInfoResponse.is_web_attack_1d"));
		describeIpInfoResponse.setIs_web_attack_7d(_ctx.stringValue("DescribeIpInfoResponse.is_web_attack_7d"));
		describeIpInfoResponse.setIs_web_attack_30d(_ctx.stringValue("DescribeIpInfoResponse.is_web_attack_30d"));
		describeIpInfoResponse.setProvince(_ctx.stringValue("DescribeIpInfoResponse.province"));
		describeIpInfoResponse.setCity(_ctx.stringValue("DescribeIpInfoResponse.city"));
		describeIpInfoResponse.setIsp(_ctx.stringValue("DescribeIpInfoResponse.isp"));
		describeIpInfoResponse.setCountry(_ctx.stringValue("DescribeIpInfoResponse.country"));
		describeIpInfoResponse.setGmt_last_nat(_ctx.stringValue("DescribeIpInfoResponse.gmt_last_nat"));
		describeIpInfoResponse.setNat_day_trace(_ctx.stringValue("DescribeIpInfoResponse.nat_day_trace"));
		describeIpInfoResponse.setIs_nat(_ctx.stringValue("DescribeIpInfoResponse.is_nat"));
		describeIpInfoResponse.setIs_nat_1d(_ctx.stringValue("DescribeIpInfoResponse.is_nat_1d"));
		describeIpInfoResponse.setIs_nat_7d(_ctx.stringValue("DescribeIpInfoResponse.is_nat_7d"));
		describeIpInfoResponse.setGmt_first_mining_pool(_ctx.stringValue("DescribeIpInfoResponse.gmt_first_mining_pool"));
		describeIpInfoResponse.setGmt_last_mining_pool(_ctx.stringValue("DescribeIpInfoResponse.gmt_last_mining_pool"));
		describeIpInfoResponse.setMining_pool_day_trace(_ctx.stringValue("DescribeIpInfoResponse.mining_pool_day_trace"));
		describeIpInfoResponse.setIs_mining_pool(_ctx.stringValue("DescribeIpInfoResponse.is_mining_pool"));
		describeIpInfoResponse.setIs_mining_pool_1d(_ctx.stringValue("DescribeIpInfoResponse.is_mining_pool_1d"));
		describeIpInfoResponse.setIs_mining_pool_7d(_ctx.stringValue("DescribeIpInfoResponse.is_mining_pool_7d"));
		describeIpInfoResponse.setGmt_first_c2(_ctx.stringValue("DescribeIpInfoResponse.gmt_first_c2"));
		describeIpInfoResponse.setGmt_last_c2(_ctx.stringValue("DescribeIpInfoResponse.gmt_last_c2"));
		describeIpInfoResponse.setC2_day_trace(_ctx.stringValue("DescribeIpInfoResponse.c2_day_trace"));
		describeIpInfoResponse.setIs_c2(_ctx.stringValue("DescribeIpInfoResponse.is_c2"));
		describeIpInfoResponse.setIs_c2_1d(_ctx.stringValue("DescribeIpInfoResponse.is_c2_1d"));
		describeIpInfoResponse.setIs_c2_7d(_ctx.stringValue("DescribeIpInfoResponse.is_c2_7d"));
		describeIpInfoResponse.setGmt_last_malicious_source(_ctx.stringValue("DescribeIpInfoResponse.gmt_last_malicious_source"));
		describeIpInfoResponse.setMalicious_source_day_trace(_ctx.stringValue("DescribeIpInfoResponse.malicious_source_day_trace"));
		describeIpInfoResponse.setIs_malicious_source(_ctx.stringValue("DescribeIpInfoResponse.is_malicious_source"));
		describeIpInfoResponse.setIs_malicious_source_1d(_ctx.stringValue("DescribeIpInfoResponse.is_malicious_source_1d"));
		describeIpInfoResponse.setIs_malicious_source_7d(_ctx.stringValue("DescribeIpInfoResponse.is_malicious_source_7d"));
		describeIpInfoResponse.setIs_malicious_source_30d(_ctx.stringValue("DescribeIpInfoResponse.is_malicious_source_30d"));
		describeIpInfoResponse.setIs_idc(_ctx.stringValue("DescribeIpInfoResponse.is_idc"));
		describeIpInfoResponse.setIdc_name(_ctx.stringValue("DescribeIpInfoResponse.idc_name"));
		describeIpInfoResponse.setIs_malicious_login(_ctx.stringValue("DescribeIpInfoResponse.is_malicious_login"));
		describeIpInfoResponse.setGmt_last_malicious_login(_ctx.stringValue("DescribeIpInfoResponse.gmt_last_malicious_login"));
		describeIpInfoResponse.setMalicious_login_day_trace(_ctx.stringValue("DescribeIpInfoResponse.malicious_login_day_trace"));
		describeIpInfoResponse.setIs_malicious_login_1d(_ctx.stringValue("DescribeIpInfoResponse.is_malicious_login_1d"));
		describeIpInfoResponse.setIs_malicious_login_7d(_ctx.stringValue("DescribeIpInfoResponse.is_malicious_login_7d"));
		describeIpInfoResponse.setMalicious_score(_ctx.stringValue("DescribeIpInfoResponse.malicious_score"));
		describeIpInfoResponse.setTags(_ctx.stringValue("DescribeIpInfoResponse.tags"));
		describeIpInfoResponse.setRdns(_ctx.stringValue("DescribeIpInfoResponse.rdns"));
	 
	 	return describeIpInfoResponse;
	}
}