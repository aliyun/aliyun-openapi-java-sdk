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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeIpInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIpInfoResponse extends AcsResponse {

	private String requestId;

	private String ip;

	private String geo;

	private String is_proxy;

	private String gmt_last_tor;

	private String tor_day_trace;

	private String total_day_cnt_tor;

	private String day_cnt_7d_tor;

	private String day_cnt_30d_tor;

	private String is_tor;

	private String gmt_last_web_attack;

	private String web_attack_day_trace;

	private String total_day_cnt_web_attack;

	private String day_cnt_7d_web_attack;

	private String day_cnt_30d_web_attack;

	private String is_web_attack;

	private String gmt_last_proxy;

	private String proxy_day_trace;

	private String is_proxy_1d;

	private String is_proxy_7d;

	private String is_tor_1d;

	private String is_tor_7d;

	private String is_web_attack_1d;

	private String is_web_attack_7d;

	private String is_web_attack_30d;

	private String province;

	private String city;

	private String isp;

	private String country;

	private String gmt_last_nat;

	private String nat_day_trace;

	private String is_nat;

	private String is_nat_1d;

	private String is_nat_7d;

	private String gmt_first_mining_pool;

	private String gmt_last_mining_pool;

	private String mining_pool_day_trace;

	private String is_mining_pool;

	private String is_mining_pool_1d;

	private String is_mining_pool_7d;

	private String gmt_first_c2;

	private String gmt_last_c2;

	private String c2_day_trace;

	private String is_c2;

	private String is_c2_1d;

	private String is_c2_7d;

	private String gmt_last_malicious_source;

	private String malicious_source_day_trace;

	private String is_malicious_source;

	private String is_malicious_source_1d;

	private String is_malicious_source_7d;

	private String is_malicious_source_30d;

	private String is_idc;

	private String idc_name;

	private String is_malicious_login;

	private String gmt_last_malicious_login;

	private String malicious_login_day_trace;

	private String is_malicious_login_1d;

	private String is_malicious_login_7d;

	private String malicious_score;

	private String tags;

	private String rdns;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getGeo() {
		return this.geo;
	}

	public void setGeo(String geo) {
		this.geo = geo;
	}

	public String getIs_proxy() {
		return this.is_proxy;
	}

	public void setIs_proxy(String is_proxy) {
		this.is_proxy = is_proxy;
	}

	public String getGmt_last_tor() {
		return this.gmt_last_tor;
	}

	public void setGmt_last_tor(String gmt_last_tor) {
		this.gmt_last_tor = gmt_last_tor;
	}

	public String getTor_day_trace() {
		return this.tor_day_trace;
	}

	public void setTor_day_trace(String tor_day_trace) {
		this.tor_day_trace = tor_day_trace;
	}

	public String getTotal_day_cnt_tor() {
		return this.total_day_cnt_tor;
	}

	public void setTotal_day_cnt_tor(String total_day_cnt_tor) {
		this.total_day_cnt_tor = total_day_cnt_tor;
	}

	public String getDay_cnt_7d_tor() {
		return this.day_cnt_7d_tor;
	}

	public void setDay_cnt_7d_tor(String day_cnt_7d_tor) {
		this.day_cnt_7d_tor = day_cnt_7d_tor;
	}

	public String getDay_cnt_30d_tor() {
		return this.day_cnt_30d_tor;
	}

	public void setDay_cnt_30d_tor(String day_cnt_30d_tor) {
		this.day_cnt_30d_tor = day_cnt_30d_tor;
	}

	public String getIs_tor() {
		return this.is_tor;
	}

	public void setIs_tor(String is_tor) {
		this.is_tor = is_tor;
	}

	public String getGmt_last_web_attack() {
		return this.gmt_last_web_attack;
	}

	public void setGmt_last_web_attack(String gmt_last_web_attack) {
		this.gmt_last_web_attack = gmt_last_web_attack;
	}

	public String getWeb_attack_day_trace() {
		return this.web_attack_day_trace;
	}

	public void setWeb_attack_day_trace(String web_attack_day_trace) {
		this.web_attack_day_trace = web_attack_day_trace;
	}

	public String getTotal_day_cnt_web_attack() {
		return this.total_day_cnt_web_attack;
	}

	public void setTotal_day_cnt_web_attack(String total_day_cnt_web_attack) {
		this.total_day_cnt_web_attack = total_day_cnt_web_attack;
	}

	public String getDay_cnt_7d_web_attack() {
		return this.day_cnt_7d_web_attack;
	}

	public void setDay_cnt_7d_web_attack(String day_cnt_7d_web_attack) {
		this.day_cnt_7d_web_attack = day_cnt_7d_web_attack;
	}

	public String getDay_cnt_30d_web_attack() {
		return this.day_cnt_30d_web_attack;
	}

	public void setDay_cnt_30d_web_attack(String day_cnt_30d_web_attack) {
		this.day_cnt_30d_web_attack = day_cnt_30d_web_attack;
	}

	public String getIs_web_attack() {
		return this.is_web_attack;
	}

	public void setIs_web_attack(String is_web_attack) {
		this.is_web_attack = is_web_attack;
	}

	public String getGmt_last_proxy() {
		return this.gmt_last_proxy;
	}

	public void setGmt_last_proxy(String gmt_last_proxy) {
		this.gmt_last_proxy = gmt_last_proxy;
	}

	public String getProxy_day_trace() {
		return this.proxy_day_trace;
	}

	public void setProxy_day_trace(String proxy_day_trace) {
		this.proxy_day_trace = proxy_day_trace;
	}

	public String getIs_proxy_1d() {
		return this.is_proxy_1d;
	}

	public void setIs_proxy_1d(String is_proxy_1d) {
		this.is_proxy_1d = is_proxy_1d;
	}

	public String getIs_proxy_7d() {
		return this.is_proxy_7d;
	}

	public void setIs_proxy_7d(String is_proxy_7d) {
		this.is_proxy_7d = is_proxy_7d;
	}

	public String getIs_tor_1d() {
		return this.is_tor_1d;
	}

	public void setIs_tor_1d(String is_tor_1d) {
		this.is_tor_1d = is_tor_1d;
	}

	public String getIs_tor_7d() {
		return this.is_tor_7d;
	}

	public void setIs_tor_7d(String is_tor_7d) {
		this.is_tor_7d = is_tor_7d;
	}

	public String getIs_web_attack_1d() {
		return this.is_web_attack_1d;
	}

	public void setIs_web_attack_1d(String is_web_attack_1d) {
		this.is_web_attack_1d = is_web_attack_1d;
	}

	public String getIs_web_attack_7d() {
		return this.is_web_attack_7d;
	}

	public void setIs_web_attack_7d(String is_web_attack_7d) {
		this.is_web_attack_7d = is_web_attack_7d;
	}

	public String getIs_web_attack_30d() {
		return this.is_web_attack_30d;
	}

	public void setIs_web_attack_30d(String is_web_attack_30d) {
		this.is_web_attack_30d = is_web_attack_30d;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGmt_last_nat() {
		return this.gmt_last_nat;
	}

	public void setGmt_last_nat(String gmt_last_nat) {
		this.gmt_last_nat = gmt_last_nat;
	}

	public String getNat_day_trace() {
		return this.nat_day_trace;
	}

	public void setNat_day_trace(String nat_day_trace) {
		this.nat_day_trace = nat_day_trace;
	}

	public String getIs_nat() {
		return this.is_nat;
	}

	public void setIs_nat(String is_nat) {
		this.is_nat = is_nat;
	}

	public String getIs_nat_1d() {
		return this.is_nat_1d;
	}

	public void setIs_nat_1d(String is_nat_1d) {
		this.is_nat_1d = is_nat_1d;
	}

	public String getIs_nat_7d() {
		return this.is_nat_7d;
	}

	public void setIs_nat_7d(String is_nat_7d) {
		this.is_nat_7d = is_nat_7d;
	}

	public String getGmt_first_mining_pool() {
		return this.gmt_first_mining_pool;
	}

	public void setGmt_first_mining_pool(String gmt_first_mining_pool) {
		this.gmt_first_mining_pool = gmt_first_mining_pool;
	}

	public String getGmt_last_mining_pool() {
		return this.gmt_last_mining_pool;
	}

	public void setGmt_last_mining_pool(String gmt_last_mining_pool) {
		this.gmt_last_mining_pool = gmt_last_mining_pool;
	}

	public String getMining_pool_day_trace() {
		return this.mining_pool_day_trace;
	}

	public void setMining_pool_day_trace(String mining_pool_day_trace) {
		this.mining_pool_day_trace = mining_pool_day_trace;
	}

	public String getIs_mining_pool() {
		return this.is_mining_pool;
	}

	public void setIs_mining_pool(String is_mining_pool) {
		this.is_mining_pool = is_mining_pool;
	}

	public String getIs_mining_pool_1d() {
		return this.is_mining_pool_1d;
	}

	public void setIs_mining_pool_1d(String is_mining_pool_1d) {
		this.is_mining_pool_1d = is_mining_pool_1d;
	}

	public String getIs_mining_pool_7d() {
		return this.is_mining_pool_7d;
	}

	public void setIs_mining_pool_7d(String is_mining_pool_7d) {
		this.is_mining_pool_7d = is_mining_pool_7d;
	}

	public String getGmt_first_c2() {
		return this.gmt_first_c2;
	}

	public void setGmt_first_c2(String gmt_first_c2) {
		this.gmt_first_c2 = gmt_first_c2;
	}

	public String getGmt_last_c2() {
		return this.gmt_last_c2;
	}

	public void setGmt_last_c2(String gmt_last_c2) {
		this.gmt_last_c2 = gmt_last_c2;
	}

	public String getC2_day_trace() {
		return this.c2_day_trace;
	}

	public void setC2_day_trace(String c2_day_trace) {
		this.c2_day_trace = c2_day_trace;
	}

	public String getIs_c2() {
		return this.is_c2;
	}

	public void setIs_c2(String is_c2) {
		this.is_c2 = is_c2;
	}

	public String getIs_c2_1d() {
		return this.is_c2_1d;
	}

	public void setIs_c2_1d(String is_c2_1d) {
		this.is_c2_1d = is_c2_1d;
	}

	public String getIs_c2_7d() {
		return this.is_c2_7d;
	}

	public void setIs_c2_7d(String is_c2_7d) {
		this.is_c2_7d = is_c2_7d;
	}

	public String getGmt_last_malicious_source() {
		return this.gmt_last_malicious_source;
	}

	public void setGmt_last_malicious_source(String gmt_last_malicious_source) {
		this.gmt_last_malicious_source = gmt_last_malicious_source;
	}

	public String getMalicious_source_day_trace() {
		return this.malicious_source_day_trace;
	}

	public void setMalicious_source_day_trace(String malicious_source_day_trace) {
		this.malicious_source_day_trace = malicious_source_day_trace;
	}

	public String getIs_malicious_source() {
		return this.is_malicious_source;
	}

	public void setIs_malicious_source(String is_malicious_source) {
		this.is_malicious_source = is_malicious_source;
	}

	public String getIs_malicious_source_1d() {
		return this.is_malicious_source_1d;
	}

	public void setIs_malicious_source_1d(String is_malicious_source_1d) {
		this.is_malicious_source_1d = is_malicious_source_1d;
	}

	public String getIs_malicious_source_7d() {
		return this.is_malicious_source_7d;
	}

	public void setIs_malicious_source_7d(String is_malicious_source_7d) {
		this.is_malicious_source_7d = is_malicious_source_7d;
	}

	public String getIs_malicious_source_30d() {
		return this.is_malicious_source_30d;
	}

	public void setIs_malicious_source_30d(String is_malicious_source_30d) {
		this.is_malicious_source_30d = is_malicious_source_30d;
	}

	public String getIs_idc() {
		return this.is_idc;
	}

	public void setIs_idc(String is_idc) {
		this.is_idc = is_idc;
	}

	public String getIdc_name() {
		return this.idc_name;
	}

	public void setIdc_name(String idc_name) {
		this.idc_name = idc_name;
	}

	public String getIs_malicious_login() {
		return this.is_malicious_login;
	}

	public void setIs_malicious_login(String is_malicious_login) {
		this.is_malicious_login = is_malicious_login;
	}

	public String getGmt_last_malicious_login() {
		return this.gmt_last_malicious_login;
	}

	public void setGmt_last_malicious_login(String gmt_last_malicious_login) {
		this.gmt_last_malicious_login = gmt_last_malicious_login;
	}

	public String getMalicious_login_day_trace() {
		return this.malicious_login_day_trace;
	}

	public void setMalicious_login_day_trace(String malicious_login_day_trace) {
		this.malicious_login_day_trace = malicious_login_day_trace;
	}

	public String getIs_malicious_login_1d() {
		return this.is_malicious_login_1d;
	}

	public void setIs_malicious_login_1d(String is_malicious_login_1d) {
		this.is_malicious_login_1d = is_malicious_login_1d;
	}

	public String getIs_malicious_login_7d() {
		return this.is_malicious_login_7d;
	}

	public void setIs_malicious_login_7d(String is_malicious_login_7d) {
		this.is_malicious_login_7d = is_malicious_login_7d;
	}

	public String getMalicious_score() {
		return this.malicious_score;
	}

	public void setMalicious_score(String malicious_score) {
		this.malicious_score = malicious_score;
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getRdns() {
		return this.rdns;
	}

	public void setRdns(String rdns) {
		this.rdns = rdns;
	}

	@Override
	public DescribeIpInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
